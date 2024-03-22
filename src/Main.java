import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean unlimitedGames = false;
        Scanner scnr = new Scanner(System.in);
        int amountGames;
        int choice;
        player plr = new player();
        plr.gatherPlrInfo();
        // Beginning Message
        // Default words constructor
        System.out.println("How many games would you like to play?\nEnter 0 for unlimited games.");
        System.out.print("> ");
        amountGames = scnr.nextInt();
        if(amountGames == 0){
            unlimitedGames = true;
        }
        if(unlimitedGames)
            while(true){
                words wordGame = new words();
                wordGame.start(plr);
                plr.gamesPlayed++;
                plr.displayPlayerStats();
            }
        else{
            for(int i = 1; i <= amountGames; i++){
                words wordGame = new words();
                wordGame.start(plr);
                plr.gamesPlayed++;
                plr.displayPlayerStats();
            }
        }
    } // end main method



} // end class