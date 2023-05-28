package week7;

public class T2CountWords {


    public static void main(String[] args) {

        String text ="hello how are you doing";

       // int result = wordCounter(text);


    }

    public static void wordCounter(String text) {

        int count = 0;

        while (text.contains(" ")) {

                text.replaceFirst(" ", "");
                count++;
            }
            System.out.println(count);

        }





    }



