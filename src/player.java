import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
public class player {
    Scanner scnr = new Scanner(System.in);
    // Variables
    public String name = "";
    public int gamesWon = 0;
    public int gamesPlayed = 0;

    // Getters and Setters
    public String getName() {
        return name;
    } // end method

    public int getGamesWon() {
        return gamesWon;
    } // end method

    public void setName(String name) {
        this.name = name;
    } // end method

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    } // end method

    public int getGamesPlayed() {
        return gamesPlayed;
    } // end method

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    } // end method

    // Constructor
    public player(String name, int gamesWon, int gamesPlayed) {
        this.name = name;
        this.gamesWon = gamesWon;
        this.gamesPlayed = gamesPlayed;
    } // end constructor

    public void exportPlayer() {
        try {
            File myFile = new File("./playerInformation.txt");
            Scanner reader = new Scanner(myFile);
            if(myFile.canWrite()){
                System.out.println("Player Stats Saved: " + myFile.getName() + ", " + myFile.getAbsolutePath());
            }
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
    public void importPlayer() {
        try {
            File myObj = new File("./playerInformation.txt");
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

    }

    // default constructor
    public player() {
        name = "";

    } // end constructor

    // displays player stats after game
    public void displayPlayerStats() {
        System.out.println("\n\n\nPlayer: " + getName() + "\nGames Won: " + getGamesWon() + "\nGames Played: " + getGamesPlayed() + "\n\n\n");
    } // end method

    // gathers player info (name)
    public void gatherPlrInfo() {
        System.out.println("What is your name?");
        String name = scnr.nextLine();
        setName(name);
    } // end method
}
