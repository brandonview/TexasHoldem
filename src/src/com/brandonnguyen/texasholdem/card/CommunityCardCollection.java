package src.com.brandonnguyen.texasholdem.card;

import java.util.List;

/**
 * Created by Brandon on 11/24/16.
 */
public class CommunityCardCollection implements CardCollection<PlayingCard>
{
    @Override
    public List<PlayingCard> getCardsAsList() {
        return null;
    }

    @Override
    public int getMaxSize() {
        return 0;
    }

    @Override
    public void setMaxSize(int maxSize) {

    }

    @Override
    public void shuffle() {

    }

    @Override
    public PlayingCard popCard() {
        return null;
    }

    @Override
    public void addCard(PlayingCard card) {

    }

    @Override
    public int getNumCards() {
        return 0;
    }
}
