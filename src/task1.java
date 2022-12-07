import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class task1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/erikfahlstrom/Desktop/AdventOfCode/Files/task1.txt");

        Scanner sc = new Scanner(file);

        int number = 0;
        int total = 0;
        int highest = 0;
        int secondhighest = 0;
        int thirdhighest = 0;

        String empty = "";

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(!(line.equals(empty))){
                number = parseInt(line);
                total += number;
            }
            if(line.equals(empty)){
                total = 0;
            }
            if(total > highest){
                highest = total;
            }
            else if(total > secondhighest){
                secondhighest = total;
            } else if(total > thirdhighest){
                thirdhighest = total;
            }
        }

        int all = highest + secondhighest + thirdhighest;

        System.out.println("Task 1, Part 1 answer: " + highest);
        System.out.println("Task 1, Part 2 answer: " + all);
    }




}
