package io.turntabl.shuffle;

import io.turntabl.card.Card;

import java.util.Random;

public class FisherYatesShuffleStrategy implements ShufflingStrategy {

    @Override
    public Card[] shuffle(Card[] cards) {
        Card[] cardsArray = cards.clone();

        // Creating a object for Random class
        Random random = new Random();

        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = cards.length-1; i > 0; i--) {
            // Pick a random index from 0 to i
            int j = random.nextInt(i+1);
            // Swap arr[i] with the element at random index
            Card temp = cardsArray[i];
            cardsArray[i] = cardsArray[j];
            cardsArray[j] = temp;
        }
        return cardsArray;
    }
}
