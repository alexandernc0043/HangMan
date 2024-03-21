import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the desired difficulty");
        System.out.println("\t1. Easy (1-3)");
        System.out.println("\t2. Medium (4-6)");
        System.out.println("\t3. Hard (6+)");

        words wordGame = new words();
        Scanner scnr = new Scanner(System.in);
        int choice = scnr.nextInt();

        switch(choice){
            case(1):
                System.out.println("You have selected Easy mode, Begin!");
                wordGame = new words("easy");
                break;
            case(2):
                System.out.println("You have selected Medium mode, Begin!");
                wordGame = new words("medium");
                break;
            case(3):
                System.out.println("You have selected Hard mode, Begin!");
                wordGame = new words("hard");
                break;
            default:
                System.out.println("Error, input is not recognized.");
        } // end switch
//        System.out.println("Before start?");
        wordGame.start();
    } // end main method
} // end class