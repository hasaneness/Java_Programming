package week6;

public class T2SwapFirstLast {


    public static void main(String[] args) {


        swap("have a good day");
        swap2("have a good day");

    }


    public static String swap ( String entry){

       String result=  " " +  entry.charAt(entry.length()-1) + entry.substring(1,entry.length()-1) + entry.charAt(0);

        System.out.println(result);

        return result;

    }

    public static void swap2 (String entry){

        System.out.println(" " +  entry.charAt(entry.length()-1) + entry.substring(1,entry.length()-1) + entry.charAt(0));

    }


}
