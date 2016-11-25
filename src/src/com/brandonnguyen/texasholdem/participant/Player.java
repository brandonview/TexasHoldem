package src.com.brandonnguyen.texasholdem.participant;

import src.com.brandonnguyen.texasholdem.action.GameAction;
import src.com.brandonnguyen.texasholdem.action.GameActionName;
import src.com.brandonnguyen.texasholdem.card.PlayingCard;

import java.util.List;

/**
 * Created by Brandon on 11/24/16.
 */
public class Player implements Participant {
    @Override
    public boolean shouldNotify() {
        //TODO
        return false;
    }

    @Override
    public void informOfAction(GameAction action) {
        //TODO

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
        //TODO
        return 0;
    }

    @Override
    public void acceptMoney(int amount) {
        //TODO

    }

    @Override
    public int releaseMoney(int amount, GameActionName precedence) {
        //TODO
        return 0;
    }

    @Override
    public GameAction act() {
        //TODO
        return null;
    }
}
