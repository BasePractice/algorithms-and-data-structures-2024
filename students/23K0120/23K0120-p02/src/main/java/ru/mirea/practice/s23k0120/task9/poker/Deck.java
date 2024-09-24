package ru.mirea.practice.s23k0120.task9.poker;

import java.util.ArrayList;

public class Deck extends ArrayList<Card> {
    public Deck() {
        for (Card.Suits suit: Card.Suits.values()) {
            for (Card.Ranks rank: Card.Ranks.values()) {
                this.add(new Card(suit, rank));
            }
        }
        this.add(new Card(Card.Suits.HEARTS, Card.Ranks.JOKER));
        this.add(new Card(Card.Suits.SPADES, Card.Ranks.JOKER));
    }


}
