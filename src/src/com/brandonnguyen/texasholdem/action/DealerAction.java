package src.com.brandonnguyen.texasholdem.action;

/**
 * TODO: re-evaluate whether this really needs to be different from PlayerAction
 *
 * DealerAction should include DEAL_TO_PLAYERS, DEAL_TURN, DEAL_FLOP, DEAL_RIVER, DEAL_BURN_CARD, DEAL_NEW_ROUND
 *
 * Should also include COLLECT_BETS, GIVE_WINNINGS and probably some other stuff I can't think of
 */
public class DealerAction implements GameAction{
    private GameActionName gameActionName;
    private int numCards;
    private int actionAmount;

    @Override
    public GameActionName getGameActionName() {
        return gameActionName;
    }
}
