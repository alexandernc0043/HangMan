import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class words {
    // Colors
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
    String BLUE = "\\u001B[31m";
    // Initial Variables
    public String word;
    ArrayList<String> board = new ArrayList<>();
    boolean gameStatus = false;
    hangMan strikes = new hangMan(0);
    Scanner scnr = new Scanner(System.in);
    ArrayList<Character> incorrectGuesses = new ArrayList<>();
    String difficulty;
//    player plr = new player();
    String[] wordsList = {"the", "of", "to", "and", "a", "in", "is", "it", "you", "that", "he", "was", "for", "on", "are", "with", "as", "I", "his", "they", "be", "at", "one", "have", "this", "from", "or", "had", "by", "not", "word", "but", "what", "some", "we", "can", "out", "other", "were", "all", "there", "when", "up", "use", "your", "how", "said", "an", "each", "she", "which", "do", "their", "time", "if", "will", "way", "about", "many", "then", "them", "write", "would", "like", "so", "these", "her", "long", "make", "thing", "see", "him", "two", "has", "look", "more", "day", "could", "go", "come", "did", "number", "sound", "no", "most", "people", "my", "over", "know", "water", "than", "call", "first", "who", "may", "down", "side", "been", "now", "find", "any", "new", "work", "part", "take", "get", "place", "made", "live", "where", "after", "back", "little", "only", "round", "man", "year", "came", "show", "every", "good", "me", "give", "our", "under", "name", "very", "through", "just", "form", "sentence", "great", "think", "say", "help", "low", "line", "differ", "turn", "cause", "much", "mean", "before", "move", "right", "boy", "old", "too", "same", "tell", "does", "set", "three", "want", "air", "well", "also", "play", "small", "end", "put", "home", "read", "hand", "port", "large", "spell", "add", "even", "land", "here", "must", "big", "high", "such", "follow", "act", "why", "ask", "men", "change", "went", "light", "kind", "off", "need", "house", "picture", "try", "us", "again", "animal", "point", "mother", "world", "near", "build", "self", "earth", "father", "head", "stand", "own", "page", "should", "country", "found", "answer", "school", "grow", "study", "still", "learn", "plant", "cover", "food", "sun", "four", "between", "state", "keep", "eye", "never", "last", "let", "thought", "city", "tree", "cross", "farm", "hard", "start", "might", "story", "saw", "far", "sea", "draw", "left", "late", "run", "don't", "while", "press", "close", "night", "real", "life", "few", "north", "open", "seem", "together", "next", "white", "children", "begin", "got", "walk", "example", "ease", "paper", "group", "always", "music", "those", "both", "mark", "often", "letter", "until", "mile", "river", "car", "feet", "care", "second", "book", "carry", "took", "science", "eat", "room", "friend", "began", "idea", "fish", "mountain", "stop", "once", "base", "hear", "horse", "cut", "sure", "watch", "color", "face", "wood", "main", "enough", "plain", "girl", "usual", "young", "ready", "above", "ever", "red", "list", "though", "feel", "talk", "bird", "soon", "body", "dog", "family", "direct", "pose", "leave", "song", "measure", "door", "product", "black", "short", "numeral", "class", "wind", "question", "happen", "complete", "ship", "area", "half", "rock", "order", "fire", "south", "problem", "piece", "told", "knew", "pass", "since", "top", "whole", "king", "space", "heard", "best", "hour", "better", "true", "during", "hundred", "five", "remember", "step", "early", "hold", "west", "ground", "interest", "reach", "fast", "verb", "sing", "listen", "six", "table", "travel", "less", "morning", "ten", "simple", "several", "vowel", "toward", "war", "lay", "against", "pattern", "slow", "center", "love", "person", "money", "serve", "appear", "road", "map", "rain", "rule", "govern", "pull", "cold", "notice", "voice", "unit", "power", "town", "fine", "certain", "fly", "fall", "lead", "cry", "dark", "machine", "note", "wait", "plan", "figure", "star", "box", "noun", "field", "rest", "correct", "able", "pound", "done", "beauty", "drive", "stood", "contain", "front", "teach", "week", "final", "gave", "green", "oh", "quick", "develop", "ocean", "warm", "free", "minute", "strong", "special", "mind", "behind", "clear", "tail", "produce", "fact", "street", "inch", "multiply", "nothing", "course", "stay", "wheel", "full", "force", "blue", "object", "decide", "surface", "deep", "moon", "island", "foot", "system", "busy", "test", "record", "boat", "common", "gold", "possible", "plane", "stead", "dry", "wonder", "laugh", "thousand", "ago", "ran", "check", "game", "shape", "equate", "hot", "miss", "brought", "heat", "snow", "tire", "bring", "yes", "distant", "fill", "east", "paint", "language", "among", "grand", "ball", "yet", "wave", "drop", "heart", "am", "present", "heavy", "dance", "engine", "position", "arm", "wide", "sail", "material", "size", "vary", "settle", "speak", "weight", "general", "ice", "matter", "circle", "pair", "include", "divide", "syllable", "felt", "perhaps", "pick", "sudden", "count", "square", "reason", "length", "represent", "art", "subject", "region", "energy", "hunt", "probable", "bed", "brother", "egg", "ride", "cell", "believe", "fraction", "forest", "sit", "race", "window", "store", "summer", "train", "sleep", "prove", "lone", "leg", "exercise", "wall", "catch", "mount", "wish", "sky", "board", "joy", "winter", "sat", "written", "wild", "instrument", "kept", "glass", "grass", "cow", "job", "edge", "sign", "visit", "past", "soft", "fun", "bright", "gas", "weather", "month", "million", "bear", "finish", "happy", "hope", "flower", "clothe", "strange", "gone", "jump", "baby", "eight", "village", "meet", "root", "buy", "raise", "solve", "metal", "whether", "push", "seven", "paragraph", "third", "shall", "held", "hair", "describe", "cook", "floor", "either", "result", "burn", "hill", "safe", "cat", "century", "consider", "type", "law", "bit", "coast", "copy", "phrase", "silent", "tall", "sand", "soil", "roll", "temperature", "finger", "industry", "value", "fight", "lie", "beat", "excite", "natural", "view", "sense", "ear", "else", "quite", "broke", "case", "middle", "kill", "son", "lake", "moment", "scale", "loud", "spring", "observe", "child", "straight", "consonant", "nation", "dictionary", "milk", "speed", "method", "organ", "pay", "age", "section", "dress", "cloud", "surprise", "quiet", "stone", "tiny", "climb", "cool", "design", "poor", "lot", "experiment", "bottom", "key", "iron", "single", "stick", "flat", "twenty", "skin", "smile", "crease", "hole", "trade", "melody", "trip", "office", "receive", "row", "mouth", "exact", "symbol", "die", "least", "trouble", "shout", "except", "wrote", "seed", "tone", "join", "suggest", "clean", "break", "lady", "yard", "rise", "bad", "blow", "oil", "blood", "touch", "grew", "cent", "mix", "team", "wire", "cost", "lost", "brown", "wear", "garden", "equal", "sent", "choose", "fell", "fit", "flow", "fair", "bank", "collect", "save", "control", "decimal", "gentle", "woman", "captain", "practice", "separate", "difficult", "doctor", "please", "protect", "noon", "whose", "locate", "ring", "character", "insect", "caught", "period", "indicate", "radio", "spoke", "atom", "human", "history", "effect", "electric", "expect", "crop", "modern", "element", "hit", "student", "corner", "party", "supply", "bone", "rail", "imagine", "provide", "agree", "thus", "capital", "won't", "chair", "danger", "fruit", "rich", "thick", "soldier", "process", "operate", "guess", "necessary", "sharp", "wing", "create", "neighbor", "wash", "bat", "rather", "crowd", "corn", "compare", "poem", "string", "bell", "depend", "meat", "rub", "tube", "famous", "dollar", "stream", "fear", "sight", "thin", "triangle", "planet", "hurry", "chief", "colony", "clock", "mine", "tie", "enter", "major", "fresh", "search", "send", "yellow", "gun", "allow", "print", "dead", "spot", "desert", "suit", "current", "lift", "rose", "continue", "block", "chart", "hat", "sell", "success", "company", "subtract", "event", "particular", "deal", "swim", "term", "opposite", "wife", "shoe", "shoulder", "spread", "arrange", "camp", "invent", "cotton", "born", "determine", "quart", "nine", "truck", "noise", "level", "chance", "gather", "shop", "stretch", "throw", "shine", "property", "column", "molecule", "select", "wrong", "gray", "repeat", "require", "broad", "prepare", "salt", "nose", "plural", "anger", "claim", "continent", "oxygen", "sugar", "death", "pretty", "skill", "women", "season", "solution", "magnet", "silver", "thank", "branch", "match", "suffix", "especially", "fig", "afraid", "huge", "sister", "steel", "discuss", "forward", "similar", "guide", "experience", "score", "apple", "bought", "led", "pitch", "coat", "mass", "card", "band", "rope", "slip", "win", "dream", "evening", "condition", "feed", "tool", "total", "basic", "smell", "valley", "nor", "double", "seat", "arrive", "master", "track", "parent", "shore", "division", "sheet", "substance", "favor", "connect", "post", "spend", "chord", "fat", "glad", "original", "share", "station", "dad", "bread", "charge", "proper", "bar", "offer", "segment", "slave", "duck", "instant", "market", "degree", "populate", "chick", "dear", "enemy", "reply", "drink", "occur", "support", "speech", "nature", "range", "steam", "motion", "path", "liquid", "log", "meant", "quotient", "teeth", "shell", "neck"};
    /*
    Default constructor that sets difficulty to easy just encase code somehow breaks (failsafe)
     */
    public words() {
        selectDiffuclty();
        generateWord(difficulty);
    } // end constructor
    /*
    Constructor that allows for difficulty param.
     */
//    public words(String difficulty) {
//        generateWord(difficulty);
//    } // end constructor
    /*
    Method generates a random word based on difficulty param and will loop through word list until a word meets the requirements
     */
    public void generateWord(String difficulty) {
        for (String i : wordsList) {
            if (Objects.equals(difficulty, "easy")) {
                loop:
                while (true) {
                    String potWord = getRandomWord();
                    if (potWord.length() <= 3) {
                        setWord(potWord);
                        break loop;
                    } // end if length <= 5
                    else {
                        potWord = getRandomWord();
                    }
                } // end loop
                break;
            } // end if easy param
            else if (Objects.equals(difficulty, "medium")) {
                loop:
                while (true) {
                    String potWord = getRandomWord();
                    if (potWord.length() > 3 && potWord.length() < 7) {
                        setWord(potWord);
                        break loop;
                    } // end if length <= 5
                    else {
                        potWord = getRandomWord();
                    }
                } // end loop
                break;
            } // end if medium param
            else if (Objects.equals(difficulty, "hard")) {
                loop:
                while (true) {
                    String potWord = getRandomWord();
                    if (potWord.length() >= 6) {
                        setWord(potWord);
                        break loop;
                    } // end if length <= 5
                    else {
                        potWord = getRandomWord();
                    } // end else
                } // end loop
                break;
            } // end if medium
        } // end for
    } // end generateWord

    /*
    Getters and Setters for word
     */
    public void setWord(String word) {
        this.word = word;
    } // end setWord
    public String getWord() {
        return word;
    } // end getWord
    /*
    Gets a random word for word list
     */
    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(wordsList.length);
        return (wordsList[index]);
    } // end getRandomWord
    /*
    Updates board, displays strikes and prints out the underscores.
     */
    public void updateBoard() {
        strikes.display();

        for (int i = 0; i < board.size(); i++) {
            System.out.print(board.get(i));
        } // end for
        System.out.print("\n");

        System.out.println("Incorrect Guesses:");
        for (int i = 0; i < incorrectGuesses.size(); i++) {
            System.out.print(incorrectGuesses.get(i));
            System.out.print(", ");
        } // end for
        System.out.print("\n");

    } // end method update board
    /*
    Adds a strike to the hangman object.
     */
    public void addStrike(hangMan plr) {
        plr.strikes = plr.getStrikes() + 1;
    } // end method add strike
    /*
    Displays loss message and tells you the correct word.
     */
    public void loseMessage() {
        strikes.display();
        System.out.println(RED + "You have lost..." + RESET + "\nHangman has been hung.\nThe Word Was: " + word);
    } // end lose message method
    /*
    Displays win message and tells you how many remaining guesses.
     */
    public void winMessage() {
        int guessRemaining = 6 - incorrectGuesses.size();
        System.out.println(GREEN + "You won!!!" + RESET + "\n\nHang Man has been saved!\nYou had: " + guessRemaining + " guesses remaining.");
    } // end win message method
    /*
    Checks game status by seeing if the board ArrayList contains "___ " which is the underscores on the board.
     */
    public void checkGameStatus(player plr) {
        if (!board.contains("___ ")) {
            gameStatus = true;
            updateBoard();
            winMessage();
            plr.gamesWon++;
        } // end if
    } // end check game status method.

    /*
    This is where the bulk of the code is for the actual game

    It first stats with the initial board setup and prints the underscores and the hangman board.

    Then it takes the input from the guess and sees if that character is the word and if it is it removes the appropriate underscore and places the letter in the spot where the underscore was
     */
    public void start(player plr) {
        for (int i = 0; i < getWord().length(); i++) {
            board.add("___ ");
        } // end for
        updateBoard();
        loop:
        while (!gameStatus) {
            System.out.println("Please enter your guess:");
            char guess = scnr.next().toLowerCase().charAt(0);
            /*
            This If statement checks if the guess is inside the random word selected by the program.
             */
            /*
            Checks if the guess is a part of the word and if it is it replaces the board to place the guess at the correct spot.
             */

            if (word.indexOf(guess) != -1) {

                int index = word.indexOf(guess);
                while (index >= 0) {
                    board.remove(index);
                    board.add(index, (" " + String.valueOf(guess).toUpperCase() + " "));
                    index = word.indexOf(guess, index + 1);
                }
                updateBoard();
                checkGameStatus(plr);
            }// end if
            /*
            Else statement for if the guess is not in the word, it adds to incorrect guesses and adds a strike to the player and updates the board.
             */
            else {
                incorrectGuesses.add(guess);
                /*
                This if, is for when the player has used up all there guesses and hangman is hung.
                */
                if (incorrectGuesses.size() == 6) {
                    addStrike(strikes);
                    loseMessage();
                    break;
                }
                addStrike(strikes);
                updateBoard();
                checkGameStatus(plr);
            } // end else
        } // end loop
    } // end method
    public void selectDiffuclty(){
        System.out.println("Please enter the desired difficulty");
        System.out.println("\t1. Easy (1-3)");
        System.out.println("\t2. Medium (4-6)");
        System.out.println("\t3. Hard (6+)");
        System.out.print("> ");
        int choice = scnr.nextInt();

        loop:
        while(true) {
            System.out.print("> ");
            switch (choice) {
                case (1):
                    System.out.println("You have selected Easy mode, Begin!");
                    difficulty = "easy";
                    return;
                case (2):
                    System.out.println("You have selected Medium mode, Begin!");
                    difficulty = "medium";
                    return;
                case (3):
                    System.out.println("You have selected Hard mode, Begin!");
                    difficulty = "hard";
                    return;
                default:
                    // Will repeat input until valid case.
                    System.out.println("Error, input is not recognized. Try again.");
                    System.out.print("> ");
                    choice = scnr.nextInt();
            } // end switch
        } // end loop

//        return choice;
    }
    public String getDifficulty(){
        return difficulty;
    }
}

