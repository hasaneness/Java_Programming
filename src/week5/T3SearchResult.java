package week5;

public class T3SearchResult {

    public static void main(String[] args) {

        String sentence = "Total results found:32664. Sort, filter, Ratings.";
        // in order to get some part of the string we can use substring method

       int indexOfColumn = sentence.indexOf(':');
       int indexOfDot = sentence.indexOf('.');

       String findDigits = sentence.substring(indexOfColumn +1 ,indexOfDot);

        System.out.println(findDigits);






    }


}
