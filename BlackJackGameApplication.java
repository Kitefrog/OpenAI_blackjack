public class BlackJackGameApplication {
    public static void main(String[] args) {
        BlackJackGame blackJackGame = new BlackJackGame();
        playRoundOfBlackJack(blackJackGame);
    }

    public static void playRoundOfBlackJack(BlackJackGame blackJackGame) {
        // prompt the user to place their bet
        Scanner scanner = new Scanner(System.in);
        System.out.println("Place your bet: ");
        int bet = scanner.nextInt();
        blackJackGame.placeBet(bet);

        // play a round of blackjack
        blackJackGame.playRound();

        // print the main menu and pause for the dealer
        printMainMenu();
        pauseForDealer();
    }

    public static void printMainMenu() {
        System.out.println("---Main Menu---");
        System.out.println("1. Play another round of blackjack");
        System.out.println("2. Quit");
    }

    public static void pauseForDealer() {
        // pause for the dealer to shuffle the deck
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // handle the exception
        }
    }
}

