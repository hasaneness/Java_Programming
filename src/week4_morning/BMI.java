package week4_morning;

public class BMI {

    public static void main(String[] args) {

        double weight = 67;
        double height= 1.87;


        if( (weight>= 40 &&  weight <= 185) && (height >=1.2 && height<= 2.5)){
            double BMI = weight/ (height * height);
            System.out.println("BMI : " + BMI);
            String result = "";

            if(BMI <= 18.5){
                result = "Underweight";
            } else if (BMI >= 18.5 && BMI <= 24.9) {
                result = "Normal weight";
            } else if (BMI >= 25 && BMI <= 29.9 ) {
                result = "Overweight";
            } else if (BMI >= 30) {
                result = "Obese";
            }else {
                System.err.println("ERROR");
            }


            System.out.println(result);
        } else {
            System.err.println("Invalid weight or height");
        }




        boolean valid = true;

        int a = valid ? 5 : 10;
        System.out.println(a);






    }


}
