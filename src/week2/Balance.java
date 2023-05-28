package week2;

public class Balance {

    public static void main(String[] args) {

        double balance = 1000;
        double withdrawAmount = 1200;

       // balance = balance - withdrawAmount;

        balance -= withdrawAmount; // same as line 10

        if (balance < withdrawAmount){
            balance -= 100;
        }

        System.out.println(balance);




    }
}
