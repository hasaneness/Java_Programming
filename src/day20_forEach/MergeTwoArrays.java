package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;

public class MergeTwoArrays {

    public static void main(String[] args) {


        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};

        int [] arr3 = new int [arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++,k++) {
            arr3[k] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));


        System.out.println("------------------------------");


        int [] a1 = {10, 20, 30, 40, 50};
        int [] a2 = {60, 70, 80, 90};


        int [] a3 = ArraysUtility.merge(a1,a2);


        System.out.println(Arrays.toString(a3));





    }




}
