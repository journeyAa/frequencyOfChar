package repl.itAssignments;

import java.util.Scanner;

public class String_lastLetterOfWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        int lastIndexNum = word.length() -1;

        System.out.println( word.charAt(lastIndexNum));

    }
}
