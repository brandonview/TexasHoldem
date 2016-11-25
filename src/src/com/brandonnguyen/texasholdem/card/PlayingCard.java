package src.com.brandonnguyen.texasholdem.card;

/**
 * Class to represent a standard playing card
 * TODO: figure out a way to prevent players from cheating and initializing their own playing cards, maybe use package level access
 */
public class PlayingCard {
    private CardValue value;
    private CardSuit suit;

    /**
     * All args constructor.
     * @param value CardValue
     * @param suit CardSuit
     */
    public PlayingCard(CardValue value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    public CardSuit getSuit() { return suit; }
    public CardValue getValue() { return value; }

}

