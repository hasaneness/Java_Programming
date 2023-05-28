package day21_multiDimentionalArray1;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {


        int [] array = {1, 2, 3, 4, 5};
        int element = 6;

        int [] new_array = Arrays.copyOf(array, array.length +1);
        new_array[new_array.length-1] = element;


        System.out.println(Arrays.toString(new_array));


        System.out.println("--------------------------");


        int [] numbers = { 100, 90, 80, 70, 60};

        numbers = ArraysUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));


        System.out.println("-----------------------------------");


        double [] nums ={1.5, 2.4, 3.7 };

        nums = ArraysUtility.addElement(nums, 9.8);

        System.out.println(Arrays.toString(nums));





    }



}
