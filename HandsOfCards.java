import java.util.ArrayList;
import java.io.PrintStream;

public class HandOfCards {
    // The collection of playing cards in the hand
    private ArrayList<PlayingCard> cards;

    // Initialize the hand with an empty set of cards
    public HandOfCards() {
        cards = new ArrayList<PlayingCard>();
    }

    // Add a playing card to the hand
    public void addCard(PlayingCard playingCard) {
        cards.add(playingCard);
    }

    // Remove all the cards from the hand
    public void flushHand() {
        cards.clear();
    }

    // Determine the number of cards in the hand
    public int numberOfCards() {
        return cards.size();
    }

    // Check if the hand has an Ace
    public boolean hasAce() {
        for (PlayingCard card : cards) {
            if (card.getFaceValue() == 1) {
                return true;
            }
        }
        return false;
    }

    // Check if the hand is bust (i.e. the total value of the cards exceeds 21)
    public boolean isBust() {
        return getTotalValue() > 21;
    }

    // Calculate the total value of the cards in the hand
    public int getTotalValue() {
        int totalValue = 0;
        for (PlayingCard card : cards) {
            totalValue += card.getBlackJackValue();
        }
        return totalValue;
    }

    // Print the cards in the hand
    public void printHand(PrintStream printStream) {
        for (PlayingCard card : cards) {
            printStream.println(card);
        }
    }

    // Print the cards in the hand, hiding the first card if specified
    public void printHand(PrintStream printStream, Boolean hideFirstCard) {
        if (hideFirstCard && cards.size() > 0) {
            printStream.println("[Hidden]");
        }
        for (int i = hideFirstCard ? 1 : 0; i < cards.size(); i++) {
            printStream.println(cards.get(i));
        }
    }
}
