package src.com.brandonnguyen.texasholdem.card;

/**
 */
public enum CardValue {
    ACE_LOW(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE_HIGH(14),
    WILDCARD(99999999);

    int value;
    CardValue(int val) { value = val; }

    int toInt() { return value; }

}
