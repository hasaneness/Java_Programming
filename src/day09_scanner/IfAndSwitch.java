package day09_scanner;

public class IfAndSwitch {

    public static void main(String[] args) {

        int num = 75;
        String result = "";

        if (num == 50 || num == 75 || num == 100){

            switch(num){

                case 50:
                   result = "20 crew and 30 passenger" ;
                    break;

                case 75:
                    result = "25 crew and 50 passenger";
                    break;

                default:
                    result = "30 crew and 70 passenger";
                    break;
            }

            System.out.println(result);


        } else {
            System.out.println("Invalid Number");
        }











    }


}
