import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean unlimitedGames = false;
        int amountGames;
        // Beginning Message
        System.out.println("Please enter the desired difficulty");
        System.out.println("\t1. Easy (1-3)");
        System.out.println("\t2. Medium (4-6)");
        System.out.println("\t3. Hard (6+)");
        Scanner scnr = new Scanner(System.in);
        System.out.print("> ");
        int choice = scnr.nextInt();
        // Default words constructor
        words wordGame = new words();

        loop:
        while(true) {
            System.out.print("> ");
            switch (choice) {
                case (1):
                    System.out.println("You have selected Easy mode, Begin!");
                    wordGame = new words("easy");
                    break loop; // loop break for easy.
                case (2):
                    System.out.println("You have selected Medium mode, Begin!");
                    wordGame = new words("medium");
                    break loop; // loop break for medium.
                case (3):
                    System.out.println("You have selected Hard mode, Begin!");
                    wordGame = new words("hard");
                    break loop; // loop break for hard.
                default:
                    // Will repeat input until valid case.
                    System.out.println("Error, input is not recognized. Try again.");
                    System.out.print("> ");
                    choice = scnr.nextInt();
            } // end switch
        }
        System.out.println("How many games would you like to play?\nEnter 0 for unlimited games.");
        System.out.print("> ");
        amountGames = scnr.nextInt();
        if(unlimitedGames = true)
            while(true)



        // Game starter
        wordGame.start();
    } // end main method
} // end class