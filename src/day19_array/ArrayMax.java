package day19_array;

import java.util.Arrays;

public class ArrayMax {

    public static void main(String[] args) {

        int [] num = {12,576,-345,67,3,8905,90};

        int max = num[0];

        for (int i = 1; i <num.length ; i++) {

            if (num[i]>max){
                max =num[i];
            }

        }

        System.out.println(max);








    }

}
