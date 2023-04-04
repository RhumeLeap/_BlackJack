package io.turntabl.shuffle;

import io.turntabl.card.Card;

public interface ShufflingStrategy {

    public Card[] shuffle(Card[] cards);
}
