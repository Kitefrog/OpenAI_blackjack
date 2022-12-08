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
        // draw a card for the player
        this.player.getHandOfCards().addCard(this.deck.drawCard());

        // check if the player's score is greater than 21
        if (this.player.getHandOfCards().calculateScore() > 21) {
            this.gameStatus = GameStatus.DEALER_WINS;
        }
    }

    public void hitDealer() {
        // draw a card for the dealer
        this.dealer.getHandOfCards().addCard(this.deck.drawCard());

        // check if the dealer's score is greater than 21
        if (this.dealer.getHandOfCards().calculateScore() > 21) {
            this.gameStatus = GameStatus.PLAYER_WINS;
        }
    }
        // check if the dealer's score is greater than or equal to 17
        public void printGameStatus(PrintStream printStream, Boolean hideDealer) {
            printStream.println("Player's hand: ");
            printStream.println(this.player.getHandOfCards().toString());
            printStream.println("Player's chips: " + this.player.getChips());
            printStream.println();

            if (hideDealer) {
                printStream.println("Dealer's hand: [hidden] " + this.dealer.getHandOfCards().getCard(0));
            }
            else {
                printStream.println("Dealer's hand: ");
                printStream.println(this.dealer.getHandOfCards().toString());
            }
            printStream.println("Dealer's chips: " + this.dealer.getChips());
            printStream.println();
        }

    public void printGameStatus() {
        this.printGameStatus(System.out, false);
    }

    public void printRoundResult() {
        if (this.gameStatus == GameStatus.PLAYER_WINS) {
            System.out.println("Player wins!");
            this.player.setChips(this.player.getChips() + 1);
        }
        else if (this.gameStatus == GameStatus.DEALER_WINS) {
            System.out.println("Dealer wins.");
            this.dealer.setChips(this.dealer.getChips() + 1);
        }
        else {
            System.out.println("It's a tie.");
        }
    }

}

