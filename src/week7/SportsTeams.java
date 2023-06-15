package week7;

public class SportsTeams {

    String name;
    int numberOfPlayers;
    String coach;
    String winLoss;
    String country;
    int numberOfFans;

    public SportsTeams(String name, int numberOfPlayers, String coach, String winLoss, String country, int numberOfFans) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.coach = coach;
        this.winLoss = winLoss;
        this.country = country;
        this.numberOfFans = numberOfFans;
    }


    public String toString(){
        return "The " + name + " sports team is based out of " + country + ". Total of " + numberOfPlayers + " players are led by " + coach + " and currently hold a record " + winLoss + " of wins and losses. They have " + numberOfFans + " fans";
    }

    public void joinClup(){
        numberOfFans++;
    }


}
 /*
    T5SportsTeam [object type]
    Create a class called SportsTeam
    declare these instance variables:
        name, number of players, coach, win/loss record, country, number of fans
    */

    /*
    create a setInfo() method to initialize these variables
    */

    /*
    create a method joinFanclub()
        it is a void method with no parameters, but whenever it is run the number of fans increases by one
    */
