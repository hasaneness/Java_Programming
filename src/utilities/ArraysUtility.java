package utilities;

import java.util.Arrays;

public class ArraysUtility {


    public static int[] merge (int[]arr1, int[]arr2){


        int [] arr3 = new int [arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++,k++) {
            arr3[k] = arr2[i];
        }

        return arr3;


    }



    public static char[] merge (char[]arr1, char[]arr2){


        char [] arr3 = new char [arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++,k++) {
            arr3[k] = arr2[i];
        }

        return arr3;


    }



    public static int[] addElement( int[] array, int element){

        int [] new_array = Arrays.copyOf(array, array.length +1);
        new_array[new_array.length-1] = element;

        return new_array;
    }



    public static double[] addElement( double[] array, double element){

        double [] new_array = Arrays.copyOf(array, array.length +1);
        new_array[new_array.length-1] = element;

        return new_array;
    }


    public static char[] addElement( char[] array, char element){

        char [] new_array = Arrays.copyOf(array, array.length +1);
        new_array[new_array.length-1] = element;

        return new_array;
    }


    public static String[] addElement( String[] array, String element){

        String [] new_array = Arrays.copyOf(array, array.length +1);
        new_array[new_array.length-1] = element;

        return new_array;
    }




    /* public static boolean contains (double[] array, double element){

        for (double each : array) {
            if (each.equals(element)){
                return true;

            }
        }

        return false;


    }
*/


    public static boolean contains (String[] array, String element){

        for (String each : array) {
            if (each.equals(element)){
                return true;

            }
        }

        return false;


    }





}
