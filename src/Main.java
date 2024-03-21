import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Beginning Message
        System.out.println("Please enter the desired difficulty");
        System.out.println("\t1. Easy (1-3)");
        System.out.println("\t2. Medium (4-6)");
        System.out.println("\t3. Hard (6+)");
        words wordGame = new words();
        loop:
        while(true) {
            Scanner scnr = new Scanner(System.in);
            System.out.print("> ");
            int choice = scnr.nextInt();
            // Sets game to desired difficulty
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
            } // end switch
        }
        // Game starter
        wordGame.start();
    } // end main method
} // end class