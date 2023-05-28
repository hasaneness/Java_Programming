package day19_array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char [] alphabet = new char[26];
        char [] descending = new char[26];


        for (int i = 0, j= 'A',k ='Z'; i < alphabet.length; i++ , j++, k--) {

            alphabet[i]= (char)j; //implicit casting
            descending[i] =(char)k;


        }


        System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(descending));


        char [] characters = new char[65535];
        for (int i = 0; i < characters.length; i++) {
            characters[i] =(char) i;
        }

        //System.out.println(Arrays.toString(characters));









    }
}
