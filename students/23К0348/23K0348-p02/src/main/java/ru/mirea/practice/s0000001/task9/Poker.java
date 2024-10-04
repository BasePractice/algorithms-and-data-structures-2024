package ru.mirea.practice.s0000001.task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();

        List<String> deck = createDeck();
        Collections.shuffle(deck);

        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i + 1) + ": " + dealHand(deck, i * 5));
        }
    }

    private static List<String> createDeck() {
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        List<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String value : values) {
                deck.add(value + suit);
            }
        }
        return deck;
    }

    private static String dealHand(List<String> deck, int start) {
        StringBuilder hand = new StringBuilder();
        for (int i = start; i < start + 5; i++) {
            hand.append(deck.get(i)).append(" ");
        }
        return hand.toString();
    }
}
