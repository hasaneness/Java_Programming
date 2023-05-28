package day20_forEach;

import java.util.Arrays;
public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int [] score ={10, 20, 30, 40, 50, 60 };

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);

        System.out.println(result);

        System.out.println("--------------------------");

        int [] a1 = {1,2,3,4,5};
        int [] a2 = {1,2,3,4,5};

        boolean eq = Arrays.equals(a1, a2);
        System.out.println(eq);

        System.out.println(Arrays.equals(a1, a2));

        System.out.println("----------------------");


        char [] ch1 = {'A', 'B', 'C'};
        char [] ch2 = {'A', 'C', 'B'};

        System.out.println(Arrays.equals(ch1, ch2));

        System.out.println("-------------------------");

        int [] nums = {12, 45, 3, 6789, 857,23};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length-1]);

        System.out.println("---------------------------");

        String [] b1 = {"C", "A", "B"};
        String [] b2 = {"A", "C", "B"};

        Arrays.sort(b1);
        Arrays.sort(b2);

        System.out.println( Arrays.equals(b1, b2));

        System.out.println("--------------------------");

        int [] array = {10, 20, 30, 40, 50, 60, 70};

        int [] array2 = Arrays.copyOf(array, 4);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        System.out.println("----------------------------");


        int [] n1 = {1, 2, 3, 4, 5};
        int [] n2 = {6, 7, 8, 9};

        int [] n3 = Arrays.copyOf(n1, n1.length + n2.length);

        for (int i = 0,j =n1.length; i < n2.length ; i++, j++) {

            n3 [j] =n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("-----------------------------");

        char [] ch = {'A', 'B', 'C', 'D', 'E', 'F'};

        char [] result1 = Arrays.copyOf(ch, 4);

        System.out.println(Arrays.toString(result1));

        char [] result2 = Arrays.copyOfRange(ch,2,4);

        System.out.println(Arrays.toString(result2));





    }



}
