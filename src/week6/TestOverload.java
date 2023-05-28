package week6;

public class TestOverload {

    public static void main(String[] args) {

        test(45,679);

    }

    public static void test (long x, long y){
        System.out.println( x+y);
    }

    public static void test (int x , int y){
        System.out.println( x-y);
    }




}
