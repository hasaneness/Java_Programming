package day19_array;

import java.util.Arrays;

public class ArraysPractice {


    public static void main(String[] args) {


        String [] myGroup = new String[5];

        myGroup[0] = "Ahmet";
        myGroup[ myGroup.length -1]= "Ashel";
        myGroup[2] = "Sumeyye";
        myGroup[1] = "Enes";
        myGroup[3] = "jonas";

        System.out.println(Arrays.toString(myGroup));



        System.out.println("------------------------");

        for (int i = myGroup.length -1 ; i >=0 ; i--) {
            System.out.println(myGroup[i]);
        }











    }


}
