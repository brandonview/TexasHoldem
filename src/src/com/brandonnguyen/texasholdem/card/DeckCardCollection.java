package src.com.brandonnguyen.texasholdem.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The cards int the deck that the dealer owns and shouldn't be viewable to players.
 */

public class DeckCardCollection implements CardCollection<PlayingCard> {
    private int maxSize;

    private ArrayList<PlayingCard> cards;

    public DeckCardCollection(CardValue[] includedValues, CardSuit[] includedSuits, int maxSize) {
        this.maxSize = maxSize;

        cards = new ArrayList<>();
        for (CardValue value : includedValues) {
            for (CardSuit suit : includedSuits) {
                cards.add(new PlayingCard(value, suit));
            }
        }

    }

    @Override
    public List<PlayingCard> getCardsAsList() {
        return cards;
    }

    @Override
    public int getMaxSize() {
        return maxSize;
    }

    @Override
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void shuffle() {
        //TODO: figure out if this is the best way to shuffle
        Collections.shuffle(cards);
    }

    @Override
    public PlayingCard popCard() {
        return cards.remove(0);
    }

    @Override
    public void addCard(PlayingCard card) {
        cards.add(card);
    }

    @Override
    public int getNumCards() {
        return cards.size();
    }
}
