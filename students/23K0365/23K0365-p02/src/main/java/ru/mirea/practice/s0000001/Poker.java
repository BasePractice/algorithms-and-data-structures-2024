package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class Poker {
    public static final String[] RANKS = {
        "2",
        "3",
        "4",
        "5",
        "King",
        "Aces"
    };
    public static final String[] SUITS = {
        "Spades",
        "Diamond",
        "Clubs",
        "Heats"
    };

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Amount of players:");
            int amountPlayers = sc.nextInt();

            List<String> deck = new ArrayList<>();
            for (String a: SUITS) {
                for (String b: RANKS) {
                    deck.add(b + " of " + a);
                }
            }
            Collections.shuffle(deck);

            for (int i = 0; i < amountPlayers; i++) {
                System.out.print("Player #" + (i + 1) + ": ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(deck.remove(0) + ", ");
                }
                System.out.println();
            }

        }
    }
}