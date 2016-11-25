package src.com.brandonnguyen.texasholdem.game;

import src.com.brandonnguyen.texasholdem.card.CardSuit;
import src.com.brandonnguyen.texasholdem.card.CardValue;

/**
 * Class to define the type of game being played.
 */
public final class GameType {
    private CardValue[] includedCardValues;
    private CardSuit[] includedCardSuits;
    private int numInitialDeckCards;
    private int numInitialPlayerCards;
    private int numInitialCommunityCards;
    private int numPlayers;
    private int smallBlind;
    private int bigBlind;
    private int limit;
    private int startAmount;
    private boolean isBlind;
    private boolean isAnte;
    private boolean isLimit;
    private boolean isPotLimit;
    private boolean isHighGame;
    private boolean isHighLowSplit;

// region constructors

    // TODO: Jesus, this is terrible, make a builder for this instead
    private GameType(CardValue[] includedCardValues, CardSuit[] includedCardSuits, int numInitialDeckCards,
                    int numInitialPlayerCards, int numInitialCommunityCards, int numPlayers, int smallBlind,
                    int bigBlind, int limit, int startAmount, boolean isBlind, boolean isAnte, boolean isLimit,
                    boolean isPotLimit, boolean isHighGame, boolean isHighLowSplit) {
        this.includedCardValues = includedCardValues;
        this.includedCardSuits = includedCardSuits;
        this.numInitialDeckCards = numInitialDeckCards;
        this.numInitialPlayerCards = numInitialPlayerCards;
        this.numInitialCommunityCards = numInitialCommunityCards;
        this.numPlayers = numPlayers;
        this.smallBlind = smallBlind;
        this.bigBlind = bigBlind;
        this.limit = limit;
        this.startAmount = startAmount;
        this.isBlind = isBlind;
        this.isAnte = isAnte;
        this.isLimit = isLimit;
        this.isPotLimit = isPotLimit;
        this.isHighGame = isHighGame;
        this.isHighLowSplit = isHighLowSplit;
    }


// endregion

// region static game types
    private static final CardSuit[] TEXAS_HOLDEM_SUITS = {
        CardSuit.SPADE,
        CardSuit.HEART,
        CardSuit.CLUB,
        CardSuit.DIAMOND
    };

    private static final CardValue[] TEXAS_HOLDEM_VALUES = {
            CardValue.TWO,
            CardValue.THREE,
            CardValue.FOUR,
            CardValue.FIVE,
            CardValue.SIX,
            CardValue.SEVEN,
            CardValue.EIGHT,
            CardValue.NINE,
            CardValue.TEN,
            CardValue.JACK,
            CardValue.QUEEN,
            CardValue.KING,
            CardValue.ACE_HIGH,
    };

    public static final GameType TEXAS_HOLDEM_GAME_TYPE = new GameType(TEXAS_HOLDEM_VALUES, TEXAS_HOLDEM_SUITS, 52, 2,
            0, 6, 5, 10, 0, 1000, true, false, false, false, true, false);
// endregion

// region getters and setters

    public CardValue[] getIncludedCardValues() {
        return includedCardValues;
    }

    public void setIncludedCardValues(CardValue[] includedCardValues) {
        this.includedCardValues = includedCardValues;
    }

    public CardSuit[] getIncludedCardSuits() {
        return includedCardSuits;
    }

    public void setIncludedCardSuits(CardSuit[] includedCardSuits) {
        this.includedCardSuits = includedCardSuits;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int getSmallBlind() {
        return smallBlind;
    }

    public void setSmallBlind(int smallBlind) {
        this.smallBlind = smallBlind;
    }

    public int getBigBlind() {
        return bigBlind;
    }

    public void setBigBlind(int bigBlind) {
        bigBlind = bigBlind;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public boolean isBlind() {
        return isBlind;
    }

    public void setIsBlind(boolean isBlind) {
        this.isBlind = isBlind;
    }

    public boolean isAnte() {
        return isAnte;
    }

    public void setIsAnte(boolean isAnte) {
        this.isAnte = isAnte;
    }

    public boolean isLimit() {
        return isLimit;
    }

    public void setIsLimit(boolean isLimit) {
        this.isLimit = isLimit;
    }

    public boolean isPotLimit() {
        return isPotLimit;
    }

    public void setIsPotLimit(boolean isPotLimit) {
        this.isPotLimit = isPotLimit;
    }

    public boolean isHighGame() {
        return isHighGame;
    }

    public void setIsHighGame(boolean isHighGame) {
        this.isHighGame = isHighGame;
    }

    public boolean isHighLowSplit() {
        return isHighLowSplit;
    }

    public void setIsHighLowSplit(boolean isHighLowSplit) {
        this.isHighLowSplit = isHighLowSplit;
    }

    public int getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(int startAmount) {
        this.startAmount = startAmount;
    }

    public int getNumInitialDeckCards() {
        return numInitialDeckCards;
    }

    public void setNumInitialDeckCards(int numInitialDeckCards) {
        this.numInitialDeckCards = numInitialDeckCards;
    }

    public int getNumInitialPlayerCards() {
        return numInitialPlayerCards;
    }

    public void setNumInitialPlayerCards(int numInitialPlayerCards) {
        this.numInitialPlayerCards = numInitialPlayerCards;
    }

    public int getNumInitialCommunityCards() {
        return numInitialCommunityCards;
    }

    public void setNumInitialCommunityCards(int numInitialCommunityCards) {
        this.numInitialCommunityCards = numInitialCommunityCards;
    }

//endregion

}
