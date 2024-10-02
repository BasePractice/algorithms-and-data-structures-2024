package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public final class CardGame {
    private static final String[] SUITS = {"♠", "♥", "♦", "♣"};
    private static final String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K", "A"
    };

    private CardGame() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество игроков: ");
            int n = scanner.nextInt();

            if (n < 1 || n > 52 / 5) {
                System.out.println("Количество игроков должно быть от 1 до " + (52 / 5) + " включительно.");
                return;
            }

            List<String> deck = createDeck();
            Collections.shuffle(deck);

            dealCards(deck, n);
        }
    }

    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(rank + suit);
            }
        }
        return deck;
    }

    private static void dealCards(List<String> deck, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print(deck.remove(deck.size() - 1) + " ");
            }
            System.out.println();
        }
    }
}