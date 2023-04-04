package io.turntabl.shuffle;

import io.turntabl.card.Card;

import java.util.Random;

public class DefaultShuffleStrategy implements ShufflingStrategy {

    @Override
    public Card[] shuffle(Card[] cards) {
        Random random = new Random();
        int lengthOfCards = cards.length;
        int halfTheLengthOfCards = lengthOfCards/2;

        for (int i = 0; i < halfTheLengthOfCards; i++) {
            int position1 = random.nextInt(0, lengthOfCards);
            int position2 = random.nextInt(0, lengthOfCards);
            swapCards(cards, position1, position2);
        }
        return cards;
    }

    private void swapCards(Card[] cards, int position1, int position2) {
        Card temp = cards[position1];
        cards[position1] = cards[position2];
        cards[position2] = temp;
    }
}
