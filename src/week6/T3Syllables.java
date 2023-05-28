package week6;

public class T3Syllables {

    public static void main(String[] args) {


        numOfSyl("e-lec-trick");


    }

    public static int numOfSyl (String word) {

        int count = 1;

        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            if (each == '-'){
                count ++;

            }

        }


        System.out.println(count);
        return count;

    }


}
