public class hangMan {
    public int strikes;
    // Credits to https://github.com/YungNewton for the HangMan Art
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
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
        System.out.println(RED + "\n" + HANGMANPICS[getStrikes()] + RESET);
    }
}
