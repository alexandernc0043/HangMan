public class player {
    private String name;
    private int gamesWon;
    private int gamesPlayed;

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

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public player(String name, int gamesWon, int gamesPlayed){
        this.name = name;
        this.gamesWon = gamesWon;
        this.gamesPlayed = gamesPlayed;
    }

    public void displayPlayerStats(player plr, words game){
        System.out.println("Player: " + plr.getName() +"\nGames Won: " + getGamesWon() + "\nGames Played: " + getGamesPlayed());
    }
}
