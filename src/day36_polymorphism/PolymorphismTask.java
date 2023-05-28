package day36_polymorphism;

import day26_statics.IPhone;
import day30_inheritance.phoneTask.Iphone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day30_inheritance.phoneTask.Samsung;

public class PolymorphismTask {

    public static void main(String[] args) {


        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Large", "Black", 900),
                new Iphone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new Iphone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Black", 350),
                new Nokia("G10", "Medium", "Silver", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new Iphone("Iphone 12 Pro", "Large", "Black", 1200),
                new Iphone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new Iphone("Iphone 6", "Small", "Gold", 400),
                new Iphone("Iphone 7", "Small", "White", 500)
        };


        for(Phone eachPhone : phones){
            System.out.println(eachPhone.getModel() + " - " + eachPhone.getColor() + " - " + eachPhone.getPrice());
        }


        System.out.println("----------------------------");

        int countSamsung = 0;

        for(Phone each : phones){
            if( each instanceof Samsung ){
                countSamsung++;
            }
        }


        System.out.println(countSamsung);


        System.out.println("-------------------------");


        for (Phone each: phones) {
            if (each instanceof Iphone || each instanceof Samsung){
                if(each.getPrice() >=700){
                    System.out.println(each.getModel());
                }
            }
        }






    }


}
