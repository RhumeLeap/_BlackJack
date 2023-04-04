package io.turntabl.card;

import io.turntabl.card.Card;
import io.turntabl.card.DeckOfCard;
import io.turntabl.shuffle.DefaultShuffleStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rhume Disi
 * @date April 3, 2023
 */
class DeckOfCardTest {

    private DeckOfCard deckOfCard;

    @BeforeEach
    void setUp() {
        deckOfCard = new DeckOfCard();
    }

    @Test
    void testNumberOfInitializedCards() {
        assertEquals(deckOfCard.getAllCards().length, 52, "Number of cards must be 52.");
    }

    @Test
    public void testDeckOfCardsInitialized() {
        boolean containsNull = Arrays.stream(deckOfCard.getAllCards()).collect(Collectors.toList())
                                    .contains(null);
        assertFalse(containsNull);
    }

    // Test number of Spades
    @Test
    public void testNumberOfSpades() {
        int numOfSpades = 13;
        int counter = 0;

        Card[] cards = deckOfCard.getAllCards();
        for (int i = 0; i < cards.length ; i++) {
            if(cards[i].getSuit().equals("S")) {
                counter++;
            }
        }
        assertEquals(counter, numOfSpades);
    }

    // Test number of Hearts
    @Test
    public void testNumberOfHearts() {
        int numOfHearts = 13;
        Card[] cards = deckOfCard.getAllCards();
        int counter = (int) Arrays.stream(deckOfCard.getAllCards())
                            .filter(card -> card.getSuit().equals("H"))
                            .count();
        assertEquals(counter, numOfHearts);
    }


    // Test number of Diamonds
    @Test
    public void testNumberOfDiamonds() {
        int numOfDiamonds = 13;
        Card[] cards = deckOfCard.getAllCards();
        int counter = (int) Arrays.stream(cards).filter(card -> card.getSuit().equals("D")).count();

        assertEquals(counter, numOfDiamonds);
    }

    // Test number of Clubs
    @Test
    public void testNumberOfClubs() {
        int numOfClubs = 13;
        Card[] cards = deckOfCard.getAllCards();
        int counter = (int) Arrays.stream(cards)
                        .filter(card -> card.getSuit().equals("C")).count();

        assertEquals(counter, numOfClubs);
    }

    // This is heavily probabilistic.
    @Test
    public void testCardShuffling() {
        List<Card> cardList = Arrays.stream(deckOfCard.getAllCards()).collect(Collectors.toList());
        Card[] cards = deckOfCard.shuffleCards(new DefaultShuffleStrategy());

        int averagePositionChange = 0;

        for (int i = 0; i < cards.length ; i++) {
            int newPosition = cardList.indexOf(cards[i]);
            if (newPosition != i && averagePositionChange <= 10) {
                averagePositionChange++;
            }
        }
        assertTrue(averagePositionChange >= 10, "The position of 10 cards is expected to change.");
    }
}