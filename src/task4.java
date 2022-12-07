import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class task4 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Task 4, Part 1 answer: " + part1());
        System.out.println("Task 4, Part 2 answer: " +part2());
    }

    private static int part1() throws FileNotFoundException {
        int total = 0;
        File file = new File("Files/task4.txt");

        Scanner sc = new Scanner(file);
        ArrayList<String> parts = new ArrayList<>();
        ArrayList<String> finalnumbers = new ArrayList<>();

        int first, second, third, fourth = 0;

        while(sc.hasNextLine()){
            String[] array = sc.nextLine().split(",");
            parts.add(array[0]);
            parts.add(array[1]);
        }
        for(int i = 0; i < parts.size(); i++){
            String[] single = parts.get(i).split("-");
            finalnumbers.add(single[0]);
            finalnumbers.add(single[1]);
        }
        for(int i = 0; i < finalnumbers.size(); i += 4){
            first = parseInt(finalnumbers.get(i));
            second = parseInt(finalnumbers.get(i+1));
            third = parseInt(finalnumbers.get(i+2));
            fourth = parseInt(finalnumbers.get(i+3));

            if(first >= third && second <= fourth){
                total++;
            } else if (first <= third && second >= fourth){
                total++;
            }
        }
        return total;
    }

    private static int part2() throws FileNotFoundException {
        int total = 0;
        File file = new File("Files/task4.txt");

        Scanner sc = new Scanner(file);
        ArrayList<String> parts = new ArrayList<>();
        ArrayList<String> finalnumbers = new ArrayList<>();

        int first, second, third, fourth = 0;

        while(sc.hasNextLine()){
            String[] array = sc.nextLine().split(",");
            parts.add(array[0]);
            parts.add(array[1]);
        }
        for(int i = 0; i < parts.size(); i++){
            String[] single = parts.get(i).split("-");
            finalnumbers.add(single[0]);
            finalnumbers.add(single[1]);
        }
        for(int i = 0; i < finalnumbers.size(); i += 4){
            first = parseInt(finalnumbers.get(i));
            second = parseInt(finalnumbers.get(i+1));
            third = parseInt(finalnumbers.get(i+2));
            fourth = parseInt(finalnumbers.get(i+3));

            if((first >= third && first <= fourth) || (second >= third && second <= fourth)){
                total++;
            } else if (((third >= first && third <= second) || (fourth >= first && fourth <= second))){
                total++;
            }
        }
        return total;
    }
}
