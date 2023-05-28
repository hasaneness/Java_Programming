package day30_inheritance.phoneTask;

import day30_inheritance.phoneTask.Iphone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Samsung;

public class TestPhoneObject {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone12", "Large","Black", 990);

        Samsung samsung = new Samsung("Galaxy S22", "Medium", "White", 680);

        Nokia nokia = new Nokia("Brick", "Small", "Silver", 50);


        iphone.call(911);
        nokia.call(737099933);
        samsung.call(3456678);


        System.out.println("--------------------------");


        iphone.text(6575758);
        nokia.text(53739300);
        samsung.text(7869606);


        nokia.selfDefence();
        samsung.freeze();
        iphone.faceTime(65755858);
        iphone.faceTime("jose2@gmail.com");







    }






}
