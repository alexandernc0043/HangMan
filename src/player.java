public class player {
    private String name;
    private int gamesWon;

    public String getName() {
        return name;
    }
    public int getGamesWon() {
        return gamesWon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }
    public player(String name, int gamesWon){
        this.name = name;
        this.gamesWon = gamesWon;

    }

    public void displayPlayerStats(player plr, words game){
        System.out.println("Player: " + plr.getName() +"\nGames Won");
    }
}
