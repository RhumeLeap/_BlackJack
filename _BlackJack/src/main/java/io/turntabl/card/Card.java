package io.turntabl.card;

/**
 * @author Rhume Disi
 */
public final class Card {

    private final String suit;
    private final String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public int getIntegerValueOfCard() {
        if (value.equals("A")) return 1;
        if (value.equals("K") || value.equals("Q") || value.equals("J")) return 10;
        else return Integer.getInteger(getValue());
    }

    @Override
    public String toString() {
        return "Card {suit = " + suit + ", value=" + value + '}';
    }
}


