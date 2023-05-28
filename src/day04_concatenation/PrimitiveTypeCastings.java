package day04_concatenation;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {

        // ------------Implicit Casting--------
        // means smaller type to a larger

        byte a = 25;
        long b = a;

        System.out.println(a);

        int c = a;

        long d = 3000l;

        float f = d; //implicit casting

        // ------- Explicit Casting------------

        int x = 100;
        byte y = (byte) x;

        System.out.println(y);

        int h = 500;
        short z = (short)h;

        System.out.println(z);

        float j = 20.8f;
        short q = (byte)j;
        System.out.println(q); // We will only get the integer result, it means that we will get 20 as a result

        double n1 = 2.5;
        byte n2 = (byte) n1;
        System.out.println(n2); // n1= 2.5; byte will give us an integer number means 2

        System.out.println("--------------------------");

        int num = 500;

        byte result = (byte) num;

        System.out.println(result);

        /*
        byte is unable to process number 500 so -12 is the number we get after calculation-unimportant-
         */

        int r = 50000;

        short t = (short) r;

        System.out.println(t);

        short x1 = 1000;
        long x2 = x1;
        System.out.println(x2);


        System.out.println("-----------------------");

        double u = 3000.5;

        int p = (int) u;

        double y1 = p;

        System.out.println(y1);




    }



}
