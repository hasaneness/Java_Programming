package week4_morning;

public class T1Parking {

    public static void main(String[] args) {

        int timeIn = 5;
        double fee;

        if (timeIn>= 0 && timeIn<=23){

            if (timeIn>= 6 && timeIn<= 12){
                fee = 7.50;
            } else if (timeIn>= 13 && timeIn<= 23) {
                fee = 15;
            }else {
                fee = 0;
            }




        }else{
            System.err.println("Invalid Time");
        }


    }




}
