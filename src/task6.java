import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class task6 {

    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println(part1());
        System.out.println(part2());
    }

    private static String part1() throws FileNotFoundException {
        File file = new File("Files/task6.txt");

        Scanner sc = new Scanner(file);

        String line = sc.nextLine();
        HashSet<Character> chars = new HashSet<Character>();
        String four = "";

        for(int i = 0; i <line.length(); i++){
            four = line.substring(i,i+4);
            for(int k=0; k<four.length(); k++){
                if(four.chars().distinct().count() == four.length()){
                    System.out.println(i + 4);
                }
            }
            chars.clear();
        }
        return "";
    }

    private static String part2() throws FileNotFoundException {
        File file = new File("Files/task6.txt");

        Scanner sc = new Scanner(file);

        String line = sc.nextLine();
        HashSet<Character> chars = new HashSet<Character>();
        String four = "";

        for(int i = 0; i <line.length(); i++){
            four = line.substring(i,i+14);
            for(int k=0; k<four.length(); k++){
                if(four.chars().distinct().count() == four.length()){
                    System.out.println(i + 14);
                    break;
                }
            }
        }
        return "";
    }
}
