package day25_Practices_Arrays;

import java.util.Arrays;

/*
 write a program that can combine two arrays of integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8
 */
public class Combine2Arrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,100, 50, 96, 3};
        int[] arr2 = {4,5, 13, 96, 140};

        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];  // 5
        /*arr3[0] = arr1[0];
        arr3[1] = arr1[1];
        arr3[2] = arr1[2];
        arr3[3] = arr2[0];
        arr3[4] = arr2[1];

         */

        int index = 0;
        for(int each : arr1){
            arr3[index] = each;
            index+=1;
        }
        for (int each : arr2) {
            arr3[index] = each;
            index+=1;

        }

        System.out.println(Arrays.toString(arr3));

        System.out.println(Arrays.toString(arr3));



































    }
}
