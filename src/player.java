import java.util.Scanner;
public class player {
    Scanner scnr = new Scanner(System.in);
    private String name = "";
    private int gamesWon;
    private int gamesPlayed;

    public String getName() {
        return name;
    }
    public int getGamesWon() {
        return gamesWon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public player(String name, int gamesWon, int gamesPlayed){
        this.name = name;
        this.gamesWon = gamesWon;
        this.gamesPlayed = gamesPlayed;
    }

    public player() {
        name = "";
        gamesWon = 0;
        gamesPlayed = 0;

    }
    public void displayPlayerStats(){
        System.out.println("\n\n\nPlayer: " + getName() +"\nGames Won: " + getGamesWon() + "\nGames Played: " + getGamesPlayed() + "\n\n\n");
    }
    public void gatherPlrInfo(){
        System.out.println("What is your name?");
        String name = scnr.nextLine();
        setName(name);
    }
}
