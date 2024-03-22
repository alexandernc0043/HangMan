import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean unlimitedGames = false;
        Scanner scnr = new Scanner(System.in);
        int amountGames;
        int choice;
        // Beginning Message
        // Default words constructor



        System.out.println("How many games would you like to play?\nEnter 0 for unlimited games.");
        System.out.print("> ");
        amountGames = scnr.nextInt();
        if(amountGames == 0){
            unlimitedGames = true;
        }
        if(unlimitedGames = true)
            while(true){
                words wordGame = new words();
                wordGame.start();
            }
        else{
            for(int i = 0; 9 < amountGames; i++){
                words wordGame = new words();
                wordGame.start();
            }
        }



        // Game starter
//        words wordGame = new words();
//        wordGame.start();
    } // end main method



} // end class