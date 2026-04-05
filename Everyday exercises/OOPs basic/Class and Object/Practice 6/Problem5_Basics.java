//Problem 5: Create a Team class with array of Player objects
//•	Player has name, runs
//•	Team has calculateTotalRuns(), findBestPlayer()
//        •	Pattern to learn: Objects working with collections

public class Problem5_Basics {
    public static void main(String[] args) {
        Player player1 = new Player("Hari",34);
        Player player2 = new Player("Ram",100);
        Player player3 = new Player("Kundan",30);
        Player player4 = new Player("Tejas",16);
        Player player5 = new Player("Gorkhey",89);
        Player player6 = new Player("Gopal",44);
        Player player7 = new Player("Shyam",64);
        Player player8 = new Player("John",94);
        Player player9 = new Player("Mike",34);
        Player player10 = new Player("David",33);
        Player player11 = new Player("Wialliam",103);
        Player [] players = {player2,player3,player8,player1,player4,player5,player7,player11,player6,player9,player10};
        Team NPL = new Team(players);
        System.out.println("Total runs gain by a team : "+NPL.calculateTotalRuns());
        Player bestPlayer = NPL.findBestPlayer();
        System.out.println("Best player of the team : ");
        bestPlayer.playerinfo();
    }
}
class Player{
    String name;
    int runs;
    Player(String name,int runs){
        this.name = name;
        this.runs = runs;
    }
    public void playerinfo(){
        System.out.println("Name : "+this.name+" Runs : "+this.runs);
    }
}
class Team{
    Player[] players;
    Team(Player[] teams){
        this.players = teams;
    }
    public int calculateTotalRuns(){// total runs of a team
        int totalrun = 0;
        for(Player p : players){
            totalrun += p.runs;
        }
        return totalrun;
    }
    public Player findBestPlayer(){// best player of a team
        int highestrun = players[0].runs;
        Player highestrunPlayer = players[0];
        for(int i = 1; i<players.length; i++){
            if(players[i].runs>highestrun){
                highestrun = players[i].runs;
                highestrunPlayer = players[i];
            }
        }
        return highestrunPlayer;
    }
}