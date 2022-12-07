import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    // The collection of playing cards in the deck
    private ArrayList<PlayingCard> cards;

    // Initialize the deck with a full set of playing cards
    public DeckOfCards() {
        cards = new ArrayList<PlayingCard>();
        for (int faceValue = 1; faceValue <= 13; faceValue++) {
            for (Suit suit : Suit.values()) {
                cards.add(new PlayingCard(faceValue, suit));
            }
        }
    }

    // Draw a single card from the top of the deck
    public PlayingCard drawCard() {
        if (cards.size() == 0) {
            return null;
        }
        return cards.remove(0);
    }

    // Draw a specified number of cards from the top of the deck
    public ArrayList<PlayingCard> drawHand(int num) {
        ArrayList<PlayingCard> hand = new ArrayList<PlayingCard>();
        for (int i = 0; i < num; i++) {
            PlayingCard card = drawCard();
            if (card != null) {
                hand.add(card);
            }
        }
        return hand;
    }

    // Shuffle the cards in the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Reset the deck to its initial state
    public void resetDeck() {
        cards.clear();
        for (int faceValue = 1; faceValue <= 13; faceValue++) {
            for (Suit suit : Suit.values()) {
                cards.add(new PlayingCard(faceValue, suit));
            }
        }
    }

    // Check if the deck is full
    public boolean isFull() {
        return cards.size() == 52;
    }

    // Print the cards in the deck
    public void printDeck(PrintStream printStream) {
        for (PlayingCard card : cards) {
            printStream.println(card);
        }
    }
}
