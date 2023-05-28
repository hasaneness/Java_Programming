package day11_string;

public class StringMethods3 {

    public static void main(String[] args) {

        String word = "Java";

        boolean r1 = word.isEmpty();

        System.out.println(r1);


        System.out.println("--------------------------------");

        String str = "                ";

        boolean r2 = str.isEmpty(); // str is not empty because in the double quote there is space character
        boolean r3 = str.isBlank();

        System.out.println(r2);
        System.out.println(r3);


        System.out.println("----------------------");

        String email = "cydeoschool@gmail.com";

        boolean isGmail = email.endsWith("@gmail.com");

        System.out.println(isGmail);


    }


}
