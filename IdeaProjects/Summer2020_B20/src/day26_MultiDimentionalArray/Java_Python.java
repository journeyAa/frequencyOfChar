package day26_MultiDimentionalArray;

import java.util.Arrays;

/* write a program that can return the number of appearances of “java” and “python” anywhere in the sentence
            ex:
                input: I love Java, Python is cool
                output: 1 Java 1 Python
                input: Java Java Python Python Python
                output: 2 Java 3 Python
*/
public class Java_Python {
    public static void main(String[] args) {
       String sentence = "I love Java, and Python is cool Javascript";

       String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int countJava = 0;
        int countPython = 0;

        for(String each : words){
            if(each.toLowerCase().contains("Java")){
                countJava++;
            }else if(each.toLowerCase().contains("Python")){
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);

        System.out.println(countJava==countJava);
















    }
}
