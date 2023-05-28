package day09_scanner;

public class fuat3 {

    public static void main(String[] args) {

        String first_name = "hasan";
        String last_name ="isler";


        String f_letter = first_name.substring(0,1);
        String l_letter = last_name.substring(0,1);

        String initial = f_letter + l_letter;
        System.out.println(initial);

        String upf = f_letter.toUpperCase();
        String upl = l_letter.toUpperCase();
        String x = upf + upl;

        System.out.println(x);

        System.out.println(first_name +" "+ last_name +" your first name has " + first_name.length() );




    }

}
