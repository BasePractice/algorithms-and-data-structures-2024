package ru.mirea.practice.s23k0120.task9.poker;

public class Card {
    private final Suits suit;
    private final Ranks rank;

    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suits getSuit() {
        return suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public Card getCard() {
        return new Card(this.suit, this.rank);
    }

    @Override
    public String toString() {
        if (rank == Ranks.JOKER) {
            if (suit == Suits.HEARTS) {
                return "RED " + rank;
            } else {
                return "BLACK " + rank;
            }
        }
        return rank + " " + suit;
    }

    public enum Suits {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    public enum Ranks {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE, JOKER
    }
}
