import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Task 2, Part 1 answer: " + getTotal());
        System.out.println("Task 2, Part 2 answer: " + getCorrectTotal());
    }

    private static int getCorrectTotal() throws FileNotFoundException {
        String filePath = "/Users/erikfahlstrom/Desktop/AdventOfCode/Files/task2.txt";

        ArrayList<Integer> list = convert(filePath);

        int total = 0;

        ArrayList<Integer> roundResult = new ArrayList<>();
        for (int i = 1; i < list.size(); i+=2){
            roundResult.add(list.get(i));
        }

        ArrayList<Integer> firstChoice = new ArrayList<>();
        for (int i = 0; i < list.size(); i+=2){
            firstChoice.add(list.get(i));
        }

        int result = 0;
        int choice = 0;

        for (int i = 0; i < roundResult.size(); i++){
            result = roundResult.get(i);
            choice = firstChoice.get(i);
            if(result == 3){
                total += 6;
                if(choice == 1){
                    total += 2;
                } else if(choice == 2){
                    total += 3;
                } else {
                    total += 1;
                }
            } else if(result == 2){
                total += 3;
                total += choice;
            } else {
                if(choice == 1){
                    total += 3;
                } else if(choice == 2){
                    total += 1;
                } else {
                    total += 2;
                }
            }
        }

        return total;
    }

    private static ArrayList<Integer> convert(String filePath) throws FileNotFoundException {
        ArrayList<Integer> intList = new ArrayList<>();
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String battle = sc.nextLine();
            char first = battle.charAt(0);
            char second = battle.charAt(2);
            if(first == 'A'){
                intList.add(1);
            } else if(first == 'B'){
                intList.add(2);
            } else {
                intList.add(3);
            }
            if(second == 'X'){
                intList.add(1);
            } else if(second == 'Y'){
                intList.add(2);
            } else {
                intList.add(3);
            }
        }
        return intList;
    }

    private static int getTotal() throws FileNotFoundException {
        String filePath = "/Users/erikfahlstrom/Desktop/AdventOfCode/Files/task2.txt";

        ArrayList<Integer> list = convert(filePath);

        int total = 0;

        for(int i = 0; i < list.size(); i += 2){
            int first = list.get(i);
            int second = list.get(i+1);
            if(second == 1){
                total += 1;
                if((second - first) == -1){
                    total += 0;
                } else if((second - first) == -2){
                    total += 6;
                } else {
                    total += 3;
                }
            } else if(second == 2){
                total += 2;
                if((second - first) == -1){
                    total += 0;
                } else if((second - first) == 1){
                    total += 6;
                } else {
                    total += 3;
                }
            } else {
                total += 3;
                if((second - first) == 2){
                    total += 0;
                } else if((second - first) == 1){
                    total += 6;
                } else {
                    total += 3;
                }
            }
        }
        return total;
    }


}
