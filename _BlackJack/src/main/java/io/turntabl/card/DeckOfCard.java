package io.turntabl.card;

import io.turntabl.shuffle.ShufflingStrategy;

/**
 * @author Rhume Disi
 * {@code @date} April 3, 2023
 */
public class DeckOfCard {

    private final Card[] allCards;

    public DeckOfCard() {
        this.allCards = new Card[52];
        initializeAllCards();
    }

    private void initializeAllCards() {
        String[] suits = {"H", "D", "C", "S"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int counter = 0;

        for (String suit : suits) {
            for (String value : values) {
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
}