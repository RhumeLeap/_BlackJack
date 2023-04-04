package io.turntabl.card;

/**
 * @author Rhume Disi
 */
public final class Card {

    private final SuitEnum suit;
    private final ValueEnum value;

    public Card(SuitEnum suit, ValueEnum value) {
        this.suit = suit;
        this.value = value;
    }

    public SuitEnum getSuit() {
        return suit;
    }

    public ValueEnum getValue() {
        return value;
    }

    public int getIntegerValueOfCard() {
        return value.getIntegerValue();
    }

    @Override
    public String toString() {
        return "Card {suit = " + suit + ", value=" + value + '}';
    }
}


