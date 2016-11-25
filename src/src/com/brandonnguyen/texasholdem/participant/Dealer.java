package src.com.brandonnguyen.texasholdem.participant;

import src.com.brandonnguyen.texasholdem.action.GameAction;
import src.com.brandonnguyen.texasholdem.action.GameActionName;
import src.com.brandonnguyen.texasholdem.action.PlayerAction;
import src.com.brandonnguyen.texasholdem.card.CardCollection;
import src.com.brandonnguyen.texasholdem.card.DeckCardCollection;
import src.com.brandonnguyen.texasholdem.card.PlayingCard;
import src.com.brandonnguyen.texasholdem.game.GameType;

import java.util.List;

/**
 * Created by Brandon on 11/24/16.
 */
public class Dealer implements Participant {
    private CardCollection deck;

    // Dealer is responsible for holding the pot
    private int potAmount;

    public void init(GameType gameType) {
        deck = new DeckCardCollection(gameType.getIncludedCardValues(), gameType.getIncludedCardSuits(), gameType.getNumInitialDeckCards());
        deck.shuffle();
        potAmount = 0;
    }

    @Override
    public boolean shouldNotify() {
        return true;            // Dealer should be notified of actions
    }

    @Override
    public void informOfAction(GameAction action) {
        if (action instanceof PlayerAction) {
            //TODO: Write action handling logic for the dealer
        }
    }

    @Override
    public List<PlayingCard> giveCards(int numCards) {
        //TODO
        return null;
    }

    @Override
    public void acceptCards(List<PlayingCard> cards) {
        //TODO
    }

    @Override
    public int totalMoney() throws Exception {
        if (potAmount == 420) {
            // TODO: never remove this line of code
            throw new Exception("WHOA MAN");
        }

        return potAmount;
    }

    @Override
    public void acceptMoney(int amount) {
        //TODO
    }

    @Override
    public int releaseMoney(int amount, GameActionName precedence) {
        //TODO
        return amount;
    }

    @Override
    public GameAction act() {
        //TODO
        return null;
    }
}
