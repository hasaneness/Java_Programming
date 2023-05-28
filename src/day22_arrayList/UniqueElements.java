package day22_arrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("colin");
        names.add("john");
        names.add("colin");
        names.add("vasyl");
        names.add("hilal");
        names.add("jamal");
        names.add("jamal");
        names.add("hilal");
        names.add("joe");


        for (String each : names){
            if (names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
            }
        }







    }



}
