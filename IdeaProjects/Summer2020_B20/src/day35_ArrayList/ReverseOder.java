package day35_ArrayList;

import java.util.ArrayList;

// Write a program that can print the list of integers in reversed order
// ex = list= {1,2,3,4,5}    output =={5,4,3,2,1}
public class ReverseOder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);  //autoboxing
        list.add(20);

        // list.add(3,30); can not skip index
        list.add(2,30);
        list.add(40);
        list.add(50);


        System.out.println(list);

        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");

        }



    }
}
