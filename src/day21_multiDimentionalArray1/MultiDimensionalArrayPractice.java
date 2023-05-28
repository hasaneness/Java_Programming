package day21_multiDimentionalArray1;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {


    public static void main(String[] args) {

        String [] group1 = {"joy", "julia", "joeline", "jordan"};
        String [] group2 = {"mahdiyar", "gleb", "ray"};
        String [] group3 = {"aleyna", "evan", "hasan", "ozan", "sueda"};
        String [] group4 = {"adel", "kim"};


        String [][] groups ={group1,group2, group3, group4};


        for (int i = 0; i < groups.length ; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);


            }

        }


        System.out.println("-----------------------------------");


        for ( String[] eachGroup : groups ){
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup){
                System.out.println(eachStudent);
            }
        }

        System.out.println("---------------------------------------");

        for (int i = groups.length-1; i >= 0; i--) {
            String [] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for ( String eachStudent:eachGroup) {
                System.out.println(eachStudent);
            }


        }


        System.out.println("---------------------------");

        System.out.println(groups); //hash code

        System.out.println(Arrays.toString(groups)); // hash code // Arrays.toString method is ONLY for single dimensional arrays

        System.out.println(Arrays.deepToString(groups)); // it will print thr multidimensional array






    }


}
