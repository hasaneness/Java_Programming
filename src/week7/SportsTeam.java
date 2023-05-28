package week7;

public class SportsTeam {

    String name;
    String coach;
    int numOfPlayers;
    String winLoss;
    String country;
    int numOfFans;

    public void setInfo(String name, String coach, int numOfPlayers, String winLoss, String country, int numOfFans){
        this.name = name;
        this.coach= coach;
        this.numOfPlayers =numOfPlayers;
        this.winLoss = winLoss;
        this.country = country;
        this.numOfFans = numOfFans;

    }

    public void joinFunClub(){
        numOfFans++;
    }

    public String toString() {
        return "The " + name + " sports team is based out of "+ country + ". A total of " + numOfPlayers + " players are led by " + coach + " and currently hold a " + winLoss + "record of wins and losses. They have " + numOfFans + " fans" ;
    }
}
