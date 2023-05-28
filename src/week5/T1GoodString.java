package week5;

public class T1GoodString {

    public static void main(String[] args) {

        String word = "good";
        String entry = "hjgoodjjffhhx";
        boolean result ;


       if (entry.indexOf("good")== 1 || entry.indexOf("good")== 2 ){
           result= true;
        } else{
           result = false;
       }

        System.out.println("Entry is " + (result? "true": "false"));








    }

}
