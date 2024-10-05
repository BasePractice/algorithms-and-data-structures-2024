package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Poker {
    public static void main(String[] args) {
        String[] suits = {"Черви", "Пики", "Буби", "Крести"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};

        int n = 5;

        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new Card(suits[i], ranks[j]));
            }
        }

        Collections.shuffle(deck);

        for (int i = 0; i < n; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(deck.remove(0).getSuite() + " | " + deck.remove(0).getRank());
            }
            System.out.println();
        }
    }
}
