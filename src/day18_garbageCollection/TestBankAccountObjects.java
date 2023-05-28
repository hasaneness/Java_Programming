package day18_garbageCollection;

public class TestBankAccountObjects {

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("jonas",123456789);

        System.out.println(obj1);

        obj1.deposit(1000);

        obj1.checkBalance();

        obj1.withDraw(300);

        obj1.checkBalance();


        System.out.println("------------------------------");


        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();


        account1.setInfo("sebastian", 738456399);
        account2.setInfo("Gumrah", 562900893);

        account1.deposit(670);
        account2.deposit(67399);

        System.out.println(account1);
        System.out.println(account2);


        account1.withDraw(560);
        account2.withDraw(60000);


        System.out.println(account1);
        System.out.println(account2);






    }






}
