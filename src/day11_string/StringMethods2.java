package day11_string;

public class StringMethods2 {

    public static void main(String[] args) {


        String sentence = "I love Python, Python is the best programming language, and Python is in high demand. ";

        sentence = sentence.replace("Python", "Java");

        System.out.println(sentence);

        System.out.println("------------------------------");

        String word = "java";

        word = word.replace('a','e');

        System.out.println(word);


        System.out.println("------------------------------");

        String sentence2 = "I love Java, Java is cool";

        sentence2 = sentence2.replaceFirst("Java","python");

        System.out.println(sentence2);

        System.out.println("---------------------------");

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        sentence3 = sentence3.replaceFirst(" Java", "python");
        // if we want to replace the others-not the first one- we can add some special characters like spaces to matching with others
        System.out.println(sentence3);


        System.out.println("-------------------------");

        String email = "cydeoschooljavaprogramming@gmail.com";

        email = email.substring(email.indexOf('@') + 1);

        System.out.println(email);


        System.out.println("-----------------------------");

        String sentence5 = "I study at Cydeo School";

        String schoolName = sentence5.substring(sentence5.indexOf(" C"));

        System.out.println(schoolName);


        System.out.println("----------------------------------");

        String str = "Python";

        System.out.println(str.repeat(10));

        System.out.println((str + "\n").repeat(10));

        /*
        String x = str.repeat(10);
        System.out.println(x);
        */




    }





}
