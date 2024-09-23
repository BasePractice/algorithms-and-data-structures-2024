package ru.mirea.practice.s23k0120.task9.poker;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck extends ArrayList<Card> {
    public Deck() {
        for (Card.Suits suit: Card.Suits.values()) {
            for (Card.Ranks rank: Arrays.stream(Card.Ranks.values()).toList().subList(0, 13)) {
                this.add(new Card(suit, rank));
            }
        }
        this.add(new Card(Card.Suits.HEARTS, Card.Ranks.JOKER));
        this.add(new Card(Card.Suits.SPADES, Card.Ranks.JOKER));
    }


}
