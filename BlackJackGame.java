public class BlackJackGame {
    private Player player;
    private Player dealer;
    private GameStatus gameStatus;

    public BlackJackGame() {
        // constructor code goes here
    }

    public void newRound() {
        // code for starting a new round goes here
    }

    public Player getPlayer() {
        return player;
    }

    public Player getDealer() {
        return dealer;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void hitPlayer() {
        // code for hitting the player goes here
    }

    public void hitDealer() {
        // code for hitting the dealer goes here
    }

    public void printGameStatus(PrintStream printStream, Boolean hideDealer) {
        // code for printing the game status goes here
    }

    public void printGameStatus() {
        // code for printing the game status without hiding the dealer's cards goes here
    }

    public void printRoundResult() {
        // code for printing the result of the round goes here
    }
}

