package deck;

/**
 * Created by grahambruce on 23/06/2017.
 */

public enum CardSuit {

    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    SPADES("Spades"),
    CLUBS("Clubs");

   private String type;

    CardSuit(String type) {
        this.type = type;
    }

    public String getSuit() {
        return type;
    }
}
