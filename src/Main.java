import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean unlimitedGames = false;
        Scanner scnr = new Scanner(System.in);
        int amountGames;
        player plr = new player();
        loop:
        while (true) {
            try {


                System.out.println("Would you like to import player stats?");
                System.out.print("y/n > ");
                String choice = scnr.nextLine().toLowerCase();
                switch (choice) {
                    case ("y"):
                        plr.importPlayer();
                        break loop;
                    case ("n"):
                        break loop;
                    default:
                        throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter valid input\n\n");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        plr.gatherPlrInfo();
        // Determines how many games will be played.
        System.out.println("How many games would you like to play?\nEnter 0 for unlimited games.");
        System.out.print("> ");
        try {
            amountGames = scnr.nextInt();
        } // end try
        catch (Exception e) {
            System.out.println("Please enter a valid number!");
            System.out.print("> ");
            scnr.nextLine();
            amountGames = scnr.nextInt();
        } // end catch
        if (amountGames == 0) {
            unlimitedGames = true;
        } // end if
        if (unlimitedGames) while (true) {
            words wordGame = new words();
            wordGame.start(plr);
            plr.gamesPlayed++;
            plr.displayPlayerStats();
        } // end loop
        else {
            for (int i = 1; i <= amountGames; i++) {
                words wordGame = new words();
                wordGame.start(plr);
                plr.gamesPlayed++;
                plr.displayPlayerStats();
            } // end for
        } // end else
    } // end main method


} // end class