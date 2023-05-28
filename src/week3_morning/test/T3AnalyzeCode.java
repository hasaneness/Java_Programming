package week3_morning.test;

public class T3AnalyzeCode {

    public static void main(String[] args) {


        /*

T3AnalyzeCode [unary operators, casting]

    - take a look at this given code and evaluate what the result is for each

    1)
        int a = 8;
        int b = a--;

        what is a?
        what is b?

    2) Take the given speed variable and think about which lines would need explicit casting(manually) and which ones are done implicitly(automatically)

        float speed = 20.5f;

        byte num1 = speed;
        short num2 = speed;
        int num3 = speed;
        long num4 = speed;
        float num5 = speed;
        double num6 = speed;
         */



        int a = 8;
        int b = a--;  // we never touched b so it will stay as 8
        System.out.println(a);
        System.out.println(b);


        int c = 10;
        System.out.println(c);
        int d = c-- + 3;

        System.out.println(c);
        System.out.println(d);




    }


}
