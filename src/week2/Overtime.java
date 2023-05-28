package week2;

public class Overtime {

    public static void main(String[] args) {

        int workingHours = 25;
        double hourlyRate = 24.0;
        double totalIncome;
        String message;

        if (workingHours >40){
            int overtimeHours = workingHours - 40;
            totalIncome = hourlyRate * 40;
            totalIncome += hourlyRate *overtimeHours;
            message = "Woow you worked " + workingHours + " so you will get " + totalIncome;

            System.out.println(message);

        } else {

            totalIncome =hourlyRate * workingHours;
            message = "Woow you worked " + workingHours + " so you will get " + totalIncome;

            System.out.println(totalIncome);
        }











    }


}
