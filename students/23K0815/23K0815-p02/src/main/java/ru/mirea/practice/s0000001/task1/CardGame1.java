package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public final class CardGame1 {
    private static final String[] SUITS = {"♠", "♥", "♦", "♣"};
    private static final String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "J", "Q", "K", "A"
    };
    private static final int MAX_PLAYERS = 52 / 5;
    private static final int CARDS_PER_PLAYER = 5;

    private CardGame1() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int playerCount = getPlayerCount(scanner);
            List<String> deck = createDeck();
            Collections.shuffle(deck);
            dealCards(deck, playerCount);
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    private static int getPlayerCount(Scanner scanner) {
        System.out.print("Введите количество игроков:");
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Введите целое число.");
        }
        int n = scanner.nextInt();
        if (n < 1 || n > MAX_PLAYERS) {
            throw new IllegalArgumentException("Количество игроков должно быть от 1 до " + MAX_PLAYERS + " включительно.");
        }
        return n;
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

    private static void dealCards(List<String> deck, int playerCount) {
        for (int i = 0; i < playerCount; i++) {
            System.out.println("Игрок" + (i + 1) + ":");
            for (int j = 0; j < CARDS_PER_PLAYER; j++) {
                System.out.print(deck.remove(deck.size() - 1) + " ");
            }
            System.out.println();
        }
    }
}