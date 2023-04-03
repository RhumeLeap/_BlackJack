package io.turntabl;

/**
 * @author Rhume Disi
 * @date April 3, 2023
 */
public class DeckOfCard {

    private Card[] allCards;

    public DeckOfCard() {
        this.allCards = new Card[52];
        initializeAllCards();
    }

    private void initializeAllCards() {
        char[] suits = {'H', 'D', 'C', 'S'};
        char[] values = {'2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K', 'A'};
        int counter = 0;

        for (char suit : suits) {
            for (char value : values) {
                allCards[counter++] = new Card(suit, value);
            }
        }
    }
}