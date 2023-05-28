package day19_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 45;
        int score3 = 89;


        System.out.println("----------------------");


        int [] scores  = new int[3]; // index: 0~2

        scores[1] = 55;
        scores[0] = 60;
        scores[2] = 34;

        System.out.println(Arrays.toString(scores));







    }



}
