public class hangMan {
    public int strikes;
    // Credits to https://github.com/YungNewton for the HangMan Art
    String[] HANGMANPICS = {"""
   +--+
   |  |
      |
      |
      |
      |
  =====""","""
   +--+
   |  |
   O  |
      |
      |
      |
  =====""","""
   +--+
   |  |
   O  |
   |  |
      |
      |
  =====""","""
   +--+
   |  |
   O  |
  /|  |
      |
      |
  =====""","""
   +--+
   |  |
   O  |
  /|\\ |
      |
      |
  =====""", """
   +--+
   |  |
   O  |
  /|\\ |
  /   |
      |
  =====""", """
   +--+
   |  |
   O  |
  /|\\ |
  / \\ |
      |
  ====="""};
    public hangMan(int strikes){
        this.strikes = strikes;
    }
    public int getStrikes(){
        return strikes;
    }
    public void display(){
        System.out.println("\n\n" + HANGMANPICS[getStrikes()]);
    }
}