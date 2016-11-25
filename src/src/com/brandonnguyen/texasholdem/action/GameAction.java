package src.com.brandonnguyen.texasholdem.action;

/**
 * Fuck if I know what I'm going to do with this right now.
 *
 * It makes sense to have DealerActions and PlayerActions to have the same parent type so you can collect them together
 * so this is that.
 */
public interface GameAction {
    /**
     * @return GameActionName.
     */
    GameActionName getGameActionName();
}
