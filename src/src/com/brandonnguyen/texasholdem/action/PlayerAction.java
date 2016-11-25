package src.com.brandonnguyen.texasholdem.action;

/**
 * Should probably contain a fixed way to represent player actions, whether that's final static instances of the class or an enum.
 *
 * Think of PlayerAction as a way of a player announcing to the dealer what their action is going to be.
 *
 * Player Actions can include RAISE_ACTION, CALL_ACTION, FOLD_ACTION, CHECK_ACTION, BET_ACTION.
 *
 * Player Actions will be returned by whatever strategy implementation that a player has.
 *
 */
public class PlayerAction implements GameAction{

    private PlayerAction(int actionAmount, GameActionName actionName) {
        this.actionAmount = actionAmount;
        this.actionName = actionName;
    }

    /**
     * Enum for action name.
     */
    private GameActionName actionName;

    /**
     * The amount of money involved in the action.
     * Should be 0 for CHECK_ACTION, CALL_ACTION and FOLD_ACTION.
     *
     * If a strategy returns a PlayerAction with an actionAmount, it means the player is immediately ready to
     * give that much money to the dealer and the dealer can take that much money without any further notification.
     */
    private int actionAmount;

// region static final actions
    // TODO: these probably have no real justification to be SCREAMING_SNAKE_CASE
    public PlayerAction CHECK_ACTION() {
        return new PlayerAction(0, GameActionName.CHECK_ACTION_NAME);
    }

    // TODO: maybe call action should set the amount as the amount being called
    public PlayerAction CALL_ACTION() {
        return new PlayerAction(0, GameActionName.CALL_ACTION_NAME);
    }

    public PlayerAction FOLD_ACTION() {
        return new PlayerAction(0, GameActionName.FOLD_ACTION_NAME);
    }

    /*
     * Note: RAISE_ACTION, and BET_ACTION act the same way in the rules of poker, but should have distinct names to make
     * it easier for strategies and the GameRunner to figure out more precisely what happened.
     */
    public PlayerAction RAISE_ACTION(int amount) {
        return new PlayerAction(amount, GameActionName.RAISE_ACTION_NAME);
    }

    public PlayerAction BET_ACTION(int amount) {
        return new PlayerAction(amount, GameActionName.BET_ACTION_NAME);
    }
// endregion

// region getters and setters
    public int getActionAmount() {
        return actionAmount;
    }

    public GameActionName getActionName() {
        return actionName;
    }

    public void setActionName(GameActionName actionName) {
        this.actionName = actionName;
    }

    public void setActionAmount(int actionAmount) {
        this.actionAmount = actionAmount;
    }

    @Override
    public GameActionName getGameActionName() {
        return actionName;
    }
// endregion
}
