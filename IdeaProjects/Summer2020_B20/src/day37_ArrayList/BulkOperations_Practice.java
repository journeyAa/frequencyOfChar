package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Bahar");
        students.add("Sayim");
        students.add("Bajar");
        students.add("Naz");
        students.add("Aslan");
        students.add("Marry");


        boolean b1 = students.containsAll(Arrays.asList("Aslan", "Naz", "Bahar"));

        System.out.println(b1);

        System.out.println("==========================================================");








    }
}
