package week7;

public class SomeSportTeams {

    public static void main(String[] args) {

        SportsTeam t1 = new SportsTeam();
        t1. setInfo("Galatasaray", "Fatih Terim", 23, "18/25","Turkey", 1_000_000);

        t1.joinFunClub();
        t1.joinFunClub();

        System.out.println(t1);

        System.out.println(t1.coach);
        System.out.println(t1.winLoss);




    }



}
