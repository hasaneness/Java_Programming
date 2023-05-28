package week5;

public class T2BeginningAtEnd {

    public static void main(String[] args) {


        String entry = "panelpan";
        String lastTwo = entry.substring(entry.length()-2,entry.length() );
        String firstTwo = entry.substring(0,2);

        boolean result;

       if (firstTwo.equals(lastTwo)){
           result = true;
       }else{
           result = false;
       }

        System.out.println("First and last two character of your entry are "+ (result? "same": "not same"));








    }





}
