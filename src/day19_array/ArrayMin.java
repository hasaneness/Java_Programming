package day19_array;

public class ArrayMin {

    public static void main(String[] args) {

        int [] number = {90,56,-34,67,0,987646,-3567};

        int min = number[0];


        for (int i = 1; i < number.length; i++) {
            if (number[i]<min){
                min = number[i];
            }

        }

        System.out.println("Minimum number is: " + min);




    }

}
