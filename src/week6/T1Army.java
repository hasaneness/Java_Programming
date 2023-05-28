package week6;

public class T1Army {

    public static void main(String[] args) {
        eligibilityToArmy(27,true,false);
    }

    public static void eligibilityToArmy(int age, boolean hasDiploma, boolean isCitizen){

        if (age >=21 && age <=35 && hasDiploma == true && isCitizen == true){
            System.out.println("Congratulations, You are eligible to join the army.");
        }else {
            if (hasDiploma == false){
                System.err.println("You are not eligible to join the army. You have to have a diploma");
            }else if (age < 21 && age > 35) {
                System.err.println("You are not eligible to join the army. Your age is not suitable for it");
            } else if(isCitizen == false){
                System.err.println("You are not eligible to join the army. You are not a citizen");
            } else {
                System.err.println("You are not eligible to join the army.");
            }


        }

    }




}
