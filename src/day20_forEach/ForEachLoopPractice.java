package day20_forEach;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : numbers) {

            if (each % 2 == 0){
                System.out.println(each);
            }

        }

        System.out.println("-----------------");

        int [] num ={100, 59, 6, 789, 5, 859, 9};

        int max = num [0];

        for (int i = 0; i <6; i++) {
            if (max < num[i]){
                max = num[i];
            }
        }


        System.out.println(max);

        for (int each: num) {
         if (each > max) {
             max = each;
         }
        }


        System.out.println("-----------------------");


        String [] names = {"jonas khanvalt", "muhammed karem", "john varsak"};

        for (String each : names){
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" ")+1));
        }




    }




}
