package week3_morning.test;

public class T2SumDigits {

    public static void main(String[] args) {

        int number = 655;

        int lastTwo = number % 100;

        int hundreds = (number - lastTwo) / 100;

        int firstDigit = lastTwo %10;

        int tenths = (lastTwo - firstDigit) / 10;

        int result = firstDigit + tenths + hundreds;

        System.out.println("The sum of the digits in " + number + " is " + result );



        int a = 10;
        int b = a--;

        System.out.println("a: " + a);
        System.out.println("b: " + b);



        char letter = '+';

        if (letter >= 'A' && letter <= 'Z'){
            System.out.println("Letter " + letter + " is uppercase");
        } else if (letter >= 'a' && letter <= 'z'){
            System.out.println("Letter " + letter + " is lowercase");
        }else{
            System.out.println("Unidentified letter");
        }



        char charLetter = 'h';
        boolean isUpper = charLetter >= 'A'&& charLetter <= 'Z';
        boolean isLower = charLetter >= 'a'&& charLetter <= 'z';
        String result2 = charLetter + " is ";


        if (isUpper){
            result2 += "uppercase";
        } else if (isLower) {
            result2 += "lowercase";
        }else {
            result2 += "not valid character";
        }


        System.out.println(result2);
    }


}
