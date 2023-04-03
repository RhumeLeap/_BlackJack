package io.turntabl.card;

/**
 * @author Rhume Disi
 * {@code @date} April 3, 2023
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

    @Override
    public String toString() {
        return "Card {suit = " + suit + ", value=" + value + '}';
    }
}


