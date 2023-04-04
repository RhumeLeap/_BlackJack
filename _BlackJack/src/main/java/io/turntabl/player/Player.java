package io.turntabl.player;

import io.turntabl.card.Card;
import io.turntabl.strategy.DefaultGameStrategy;
import io.turntabl.strategy.GameStrategy;

import java.util.HashSet;
import java.util.Set;

public class Player {

    private final String name;
    private Set<Card> handOfCards = new HashSet<>();
    private GameStrategy gameStrategy;

    public Player(String name) {
        this(name, new DefaultGameStrategy());
    }

    public Player(String name, GameStrategy gameStrategy) {
        this.name = name;
        this.gameStrategy = gameStrategy;
    }

    public String getName() {
        return name;
    }

    public GameStrategy getGameStrategy() {
        return gameStrategy;
    }

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    /** Card dealt to a player. */
    public void receiveOneCard(Card dealtCard) {
        handOfCards.add(dealtCard);
    }

    public Set<Card> getCardsOnHand() {
        return handOfCards;
    }

    /** Total value of all cards in a player's hand. */
    public int getTotalValueOfCardsInHand() {
        int totalValue = 0;
        for (Card eachCard : handOfCards) {
            totalValue += eachCard.getValue().getIntegerValue();
        }
        return totalValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;

        return name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Player { name = " + name + ", player's cards = " + handOfCards +
                ", gameStrategy = " + gameStrategy + " }";
    }
}
