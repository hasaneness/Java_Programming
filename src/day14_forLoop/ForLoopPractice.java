package day14_forLoop;

public class ForLoopPractice  {

    public static void main(String[] args) {

        //Sum all the numbers 1~100

        int sum = 0;
        for( int i = 1; i <= 100 ; i ++){
            sum += i;
        }

        System.out.println(sum);


        //print all the alphabet letters A~Z

        for ( char i = 'A'; i<= 'Z' ; i++){
            System.out.println( i );
        }



    }


}
