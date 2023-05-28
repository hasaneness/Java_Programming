package week2;

public class MyName {
    public static void main(String[] args) {

        System.out.println( 5 + 3);
        System.out.println( 5 + 3 + "hello");
        System.out.println( "java" + 5 + 3); // if we start with a string we will get string result

        System.out.println( "java" + ( 5 + 3 ));


        int age = 27;
        String month = "December";
        String str = "In " + month + " you will turn " + age;
        System.out.println(str);

        System.out.println(age + 5 +3);
        System.out.println(month + 5 +3);


        System.out.println("--------------------------");

        char h = 'H',
                a = 'A',
                s = 'S',
                n = 'N';

        System.out.println("My name is " + h + a + s +a +n);
        System.out.println("" + h + a + s + a + n);


        System.out.print(h);
        System.out.print(a);
        System.out.print(s);
        System.out.print(a);
        System.out.print(n);






    }

}
