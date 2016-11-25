package src.com.brandonnguyen.texasholdem.participant;

import src.com.brandonnguyen.texasholdem.action.GameAction;
import src.com.brandonnguyen.texasholdem.action.GameActionName;
import src.com.brandonnguyen.texasholdem.card.PlayingCard;

import java.util.List;

/**
 * Game Participant.
 *
 * TODO: see if you can figure out a way to facilitate the exchange of money with accept/release methods that don't allow for money to magically appear and disappear in the game
 */
public interface Participant {
    /**
     * whether or not this participant should be notified of game actions
     *
     * @return boolean
     */
    boolean shouldNotify();

    /**
     * Return participant's executed action.
     *
     * @param action GameAction
     */
    void informOfAction(GameAction action);

    /**
     * Remove playing cards from this participants collection.
     *
     * @param numCards numCards.
     * @return list of removed cards.
     */
    List<PlayingCard> giveCards(int numCards);

    /**
     * Add playing cards to this participants collection.
     *
     * @param cards cards given to this participant.
     * @throws Exception if cards are not accepted.
     */
    void acceptCards(List<PlayingCard> cards);

    /**
     * total money this player owns.
     * @return money
     * @throws Exception I can't remember why this happens.
     */
    int totalMoney() throws Exception;

    /**
     * Add money to this participants total money.
     *
     * @param amount money given to this participant.
     * @throws Exception if money is not accepted.
     */
    void acceptMoney(int amount);

    /**
     * Remove money from totalMoney most likely to give to another participant.
     *
     * @param amount remove this amount of money from participant.
     * @param precedence the GameActionName that gives precedence for removing this money so that participant can implement logic on whether or not to do so.
     *
     * @return the amount of money that was actually removed.
     */
    int releaseMoney(int amount, GameActionName precedence);

    /**
     * Perform an action.
     *
     * TODO: Figure out if this is going to be used I think I changed how I was gonna do this, might be replaced by informOfAction
     *
     * @return the action that was performed.
     */
    GameAction act();
}
