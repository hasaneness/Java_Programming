package day14_forLoop;

public class OverloadingTheMainMethod {

    public static void main(String[] args) {

        System.out.println("A");





    }

    public static void main(int[] args) {

        System.out.println("B");
    }

    public static void main(boolean[] args) {

        System.out.println("C");
    }

// main method could be overloaded ,but we are not supposed to overload it. there is point of overloading the main method because we cant execute it.
    // any method can be overloaded

}
