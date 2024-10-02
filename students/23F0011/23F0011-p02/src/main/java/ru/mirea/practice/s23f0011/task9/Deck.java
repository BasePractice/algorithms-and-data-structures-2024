package ru.mirea.practice.s23f0011.task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> dealHand(int numCards) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }
}