package week3_morning.test;

public class T4CharCase {

    public static void main(String[] args) {



/*
T4CharCase [variables, if statement, relational operator]

    Create a program that will define a char variable, which will only be defined as a letter (a-z). The character can be defined in uppercase or lowercase and we want to determine which one it is

    Output in this format:
        $character is $uppercase_or_lowercase
 */



        char letter = '+';
        boolean isUpper = letter >= 'A' && letter <= 'Z';
        boolean isLower = letter >= 'a' && letter <= 'z';

        String result = letter + " is ";

        if (isUpper){
            result += "upper case";
        }


        if (isLower){
            result += "lower case";
        }

        if (!isLower && !isUpper){
            result += " not a valid letter";
        }


        System.out.println("------------------");

        if (letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is Upper Case");
        }

        if (letter >= 'a' && letter <= 'z'){
            System.out.println(letter + " is lower Case");
        }








    }




}
