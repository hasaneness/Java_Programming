package day21_multiDimentionalArray1;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {

    public static void main(String[] args) {


        int [] arr1D = new int [10];

        System.out.println(Arrays.toString(arr1D));

        int [] arr1 ={1, 2, 3, 4, 5};
        int [] arr2 ={6, 7, 8};
        int [] arr3 ={9,10};



        int [][] arr2D = new int [3][];

        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;

        System.out.println(Arrays.deepToString(arr2D));





    }




}
