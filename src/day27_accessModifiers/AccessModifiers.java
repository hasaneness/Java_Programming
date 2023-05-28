package day27_accessModifiers;

public class AccessModifiers {

    public static int publicData = 200;
    protected static int protectedData = 300;
    static int defaultData =400;



    public static void main(String[] args) {

        System.out.println(publicData); // public is accessible within the same class
        System.out.println(protectedData); // protected is accessible within the same class

    }



}
