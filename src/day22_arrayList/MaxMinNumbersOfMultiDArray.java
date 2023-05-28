package day22_arrayList;

public class MaxMinNumbersOfMultiDArray {

    public static void main(String[] args) {

        int [][] array = { {100, 20, 300}, {10, 1000, 50}, {67, 90,789} };

        int max = array [0][0]; // we assume that the first element is the minimum
        int min = array [0][0];

        for (int [] each1D : array) {
            for (int eachElement : each1D) {

                if (eachElement > max){
                    max = eachElement;
                }

                if (eachElement < min){
                    min = eachElement;
                }

            }

        }


        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);






    }



}
