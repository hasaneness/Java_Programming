package day15_whileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aaaabbbcccc";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i); // each character of thr string str

            if( !result.contains(""+ each)){
                result += each;
            }


        }


        System.out.println(result);



    }



}
