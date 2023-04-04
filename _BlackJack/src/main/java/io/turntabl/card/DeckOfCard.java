package io.turntabl.card;

import io.turntabl.shuffle.ShufflingStrategy;

import java.util.Arrays;

/**
 * @author Rhume Disi
 */
public class DeckOfCard {

    private final Card[] allCards;

    public DeckOfCard() {
        this.allCards = new Card[52];
        initializeAllCards();
    }

    private void initializeAllCards() {
        SuitEnum[] suits = SuitEnum.values();
        ValueEnum[] values = ValueEnum.values();
        int counter = 0;

        for (SuitEnum suit : suits) {
            for (ValueEnum value : values) {
                allCards[counter++] = new Card(suit, value);
            }
        }
    }

    public Card[] getAllCards() {
        return this.allCards;
    }

    public Card[] shuffleCards(ShufflingStrategy strategy) {
        return strategy.shuffle(allCards);
    }

    @Override
    public String toString() {
        return "DeckOfCard{ allCards = " + Arrays.toString(allCards) + '}';
    }
}