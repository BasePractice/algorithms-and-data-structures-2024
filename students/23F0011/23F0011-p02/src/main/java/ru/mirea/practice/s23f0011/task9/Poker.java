package ru.mirea.practice.s23f0011.task9;

import java.util.Scanner;
import java.util.List;

public abstract class Poker {

    public static void main(String[] args) {
        int n = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество игроков: ");
            n = scanner.nextInt();
            scanner.close();
        }
        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 1; i <= n; i++) {
            System.out.println("Игрок " + i + ":");
            List<Card> hand = deck.dealHand(5);
            for (Card card : hand) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
