package day22_arrayList;

import java.sql.SQLOutput;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";

        System.out.println(str + 1);

        int num = Integer.parseInt(str);

        System.out.println(num + 1);

        System.out.println("-----------------------");


        String s = "20.5";

        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("------------------------");



        String x ="true";

        boolean r1 = Boolean.parseBoolean(x);

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);


        System.out.println("------------------------");

        char ch = 'i';

        boolean isDigit = Character.isDigit(ch);

        boolean isLetter = Character.isLetter(ch);

        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        boolean isUpperCaseLetter = Character.isUpperCase(ch);

        boolean isSpecialCharacter = !Character.isLetterOrDigit(ch); //special character



        System.out.println("isDigit = " + isDigit);

        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);

        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);

        System.out.println("isLetter = " + isLetter);

        System.out.println("isSpecialCharacter = " + isSpecialCharacter);


        System.out.println("-------------------------");

        String str1 = "a1b34jbv3jty";

        int sum = 0;

        for ( char each: str1.toCharArray()) {

            if (Character.isDigit(each)){
                Integer.parseInt("" + sum);
            }

        }

        System.out.println("sum = " + sum);






    }




}
