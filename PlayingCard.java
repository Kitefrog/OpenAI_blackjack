public class PlayingCard {
    private int faceValue;
    private Suit suit;

    public PlayingCard(int faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getBlackJackValue() {
        // face cards have a value of 10
        if (this.faceValue >= 11 && this.faceValue <= 13) {
            return 10;
        }
        // an ace can have a value of 1 or 11
        else if (this.faceValue == 1) {
            return 11;
        }
        else {
            return this.faceValue;
        }
    }

    public String toString() {
        // convert the face value to a string
        String faceValueString = "";
        if (this.faceValue == 1) {
            faceValueString = "Ace";
        }
        else if (this.faceValue == 11) {
            faceValueString = "Jack";
        }
        else if (this.faceValue == 12) {
            faceValueString = "Queen";
        }
        else if (this.faceValue == 13) {
            faceValueString = "King";
        }
        else {
            faceValueString = Integer.toString(this.faceValue);
        }

        // return the string representation of the card
        return faceValueString + " of " + getSuitStringValue(this.suit);
    }

    public static String getSuitStringValue(Suit suit) {
        if (suit == Suit.CLUBS) {
            return "Clubs";
        }
        else if (suit == Suit.DIAMONDS) {
            return "Diamonds";
        }
        else if (suit == Suit.HEARTS) {
            return "Hearts";
        }
        else {
            return "Spades";
        }
    }

    public char getSymbol() {
        if (this.suit == Suit.CLUBS) {
            return '♣';
        }
        else if (this.suit == Suit.DIAMONDS) {
            return '♦';
        }
        else if (this.suit == Suit.HEARTS) {
            return '♥';
        }
        else {
            return '♠';
        }
    }
}
