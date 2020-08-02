package day36_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
 */
public class Set_Method {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
                    list1.add(10);
                    list1.add(20);
                    list1.add(30);
                    list1.add(40);
                    list1.add(50);
                    list1.add(60);

                    list1.set(list1.size()-1,0);
        System.out.println(list1);

/*
        2. write a program that can multiply each odd number by 2
        ex: list = [1,2,3,4,5];
        output: [2,2,6,4,10]

        and each even num by 3

 */
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i<= 20; i++ ){
            list2.add(i);
        }

        System.out.println(list2);

        for (int i =0; i<= list2.size()-1; i++){
            Integer each = list2.get(i);

            if(each%2==1){    // list2.get(i) % 2 ==1
                list2.set(i, each*2);  //  list2.set(i)
            }else{
                list2.set(i,each*3);
            }
        }
        System.out.println(list2);












    }
}
