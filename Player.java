public class Player {
    private int chips;
    private HandOfCards handOfCards;

    public Player(int chips) {
        this.chips = chips;
        this.handOfCards = new HandOfCards();
    }

    public int getChips() {
        return this.chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public HandOfCards getHandOfCards() {
        return this.handOfCards;
    }
}
