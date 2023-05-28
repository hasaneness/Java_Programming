package week6;

public class Prime {


    public static void main(String[] args) {

        int range = 50;

        for (int j = 0; j < range; j++) {

            boolean isPrime = true;

            for (int i = 2; i < j; i++) {

                if (j % i == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime){
                System.out.println(j + ", ");
            }
        }


    }
}
