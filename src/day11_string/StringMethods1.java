package day11_string;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

        str1 = str1.toLowerCase();//"cydeo school"
        // we need to reassign it the str1 variable because "str1.toLowerCase();" function is not able to modify the code by itself

        System.out.println(str1);


        System.out.println("--------------------------");

        String str2 = "java programming";

        String str3 = str2.toUpperCase();

        System.out.println(str2);
        System.out.println(str3);

        System.out.println("----------------------------");

        String str4 = "             Cydeo School";

        System.out.println(str4);

        System.out.println(str4.trim()); // this object will trim the white spaces

        str4 = str4.trim();

        System.out.println(str4);

        System.out.println("---------------------------");


        String sentence1 = "Today is Sunday, and we have Java class";

        int index1 = sentence1.indexOf('w');

        System.out.println(index1);

        int index2 = sentence1.indexOf('a');

        System.out.println(index2);// we will get the result of the first 'a' left to right

        String s1 = "I love Java programming";

        int x = s1.indexOf("a "); // if we use it with double quote we can put more characters (ex:"a " -------> a and space
        System.out.println(x);






    }



}
