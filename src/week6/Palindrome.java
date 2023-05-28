package week6;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("enes"));
        System.out.println(isPalindrome("anna"));
    }

public static boolean isPalindrome( String str){

    str ="abbnjkkkk";

    for (int begin = 0 , end = str.length() -1 ; begin < str.length() / 2 ; begin++ , end--) {
        if ( str.charAt(begin) != str.charAt(end) ){
            return false;
        }

    }

    return true;


}

}
