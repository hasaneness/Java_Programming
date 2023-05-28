package week3_morning.weekend_live;

public class Books {

    public static void main(String[] args) {

        String genre = "fantasy";
        int page = 0, profit = 0, sequels = 0, countries = 0; // these integers should declare with any number first to be executed. we change them in the code
        boolean isValid = true;

        switch (genre){
            case "fantasy":
                page = 550;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;

            case "detective":
                page = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;

            case "science fiction":
                page = 720;
                profit = 900_000;
                sequels = 4;
                countries = 40;
                break;

            case "short story":
                page = 250;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;

            default:
                isValid = false;
                break;
                // it means if non of these above are not correct we will get default result. as a default result we assigned invalid as false it means if the code works invalid equal true;

        }


        if (isValid){
            String message = " The " + genre + " genre usually has profits of " + profit + " being sold in " + countries + " different countries. The " + genre + " books often have " + sequels + " squels with each book roughly being around" + page + " pages.";

            System.out.println(message);
        } else {
            System.out.println(" Sorry, we dont have information for the " + genre + "genre");
        }










    }



}
