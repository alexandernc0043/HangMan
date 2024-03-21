public class hangman {
    private int strikes;
    // Credits to https://github.com/YungNewton for the HangMan Art
    String[] HANGMANPICS = {"""

            +---+
            |   |
            |
            |
            |
            |
            =========""", """
            
            +---+
            |   |
    O   |
            |
            |
            |
            =========""", """
            
            +---+
            |   |
    O   |
            |   |
            |
            |
            =========""", """
            +---+
            |   |
    O   |
            /|   |
            |
            |
            =========""", """
            +---+
            |   |
    O   |
            /|\b  |
            |
            |
            =========""", """
            +---+
            |   |
    O   |
            /|\b  |
            /    |
            |
            =========""", """
            +---+
            |   |
    O   |
            /|\b  |
            / \b  |
            |
            ========="""};
    public hangman(int strikes){
        this.strikes = strikes;
    }
    public int getStrikes(){
        return strikes;
    }
    public void display(){
        System.out.println("\n\n" + HANGMANPICS[getStrikes()]);
    }
}
