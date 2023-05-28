package week3_morning.weekend_live;

public class Finra {


    public static void main(String[] args) {

        int num = 17;
        String result = "";
        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;


        if (by3 && by5){
            result = "FINRA";
        } else if (by5){
            result = "FIN";
        } else if (by3){
            result = "RA";
        } else{
            System.out.println(num);
        }

        System.out.println(result);

        System.out.println(by3 && by5 ? "FINRA" : by3 ? "FIN" : by5 ? "RA" : num );











    }


}
