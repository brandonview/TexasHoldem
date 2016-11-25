package src.com.brandonnguyen.texasholdem.card;

import java.util.List;

/**
 * Interface for a collection of cards, this can be a deck or a players hand
 * TODO: !important shit shit shit this should just be an abstract class probably do that refactor before you do any more implementation
 * TODO: find out if that !important thing in the last todo does anything
 */
public interface CardCollection<T extends PlayingCard>  {
    /**
     * Returns all cards in the collection as a list.
     * @return all cards
     */
    List<T> getCardsAsList();

    /**
     * The maximum number of cards in this collection.
     * @return max size
     */
    int getMaxSize();

    /**
     * Setter for maxSize.
     * @param maxSize the maximum number of cards
     */
    void setMaxSize(int maxSize);

    /**
     * Shuffle cards in a random order.
     */
    void shuffle();

    /**
     * Remove a card from the collection.
     * @return The card that was removed
     */
    T popCard();

    /**
     * Add a card to the collection.
     * @param card The card to be added
     */
    void addCard(T card);

    /**
     * How many cards are currently in the collection.
     * @return number of cards in the list
     */
    int getNumCards();
}
