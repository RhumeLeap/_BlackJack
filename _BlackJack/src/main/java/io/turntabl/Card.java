package io.turntabl;

/**
 * @author Rhume Disi
 * @date April 3, 2023
 */
public final class Card {

    private char suit;
    private char value;

    public Card(char suit, char value) {
        this.suit = suit;
        this.value = value;
    }

    public char getSuit() {
        return suit;
    }

    public char getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (suit != card.suit) return false;
        return value == card.value;
    }

    @Override
    public int hashCode() {
        int result = suit;
        result = 31 * result + (int) value;
        return result;
    }

    @Override
    public String toString() {
        return "Card {suit = " + suit + ", value=" + value + '}';
    }
}


