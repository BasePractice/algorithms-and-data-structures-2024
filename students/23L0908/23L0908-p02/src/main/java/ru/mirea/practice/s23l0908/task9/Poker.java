package ru.mirea.practice.s23l0908.task9;

import java.util.Scanner;
import java.util.Random;

public final class Poker {

    private Poker() {

    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jacks", "Queens", "Kings", "Aces"};
            int cardAmount = suits.length * ranks.length;
            int playerCardsAmount = 5;

            System.out.print("Enter the number of players: ");
            int players = input.nextInt();

            if (players * playerCardsAmount > cardAmount) {
                System.out.println("Too many players for the available deck.");
                return;
            }
            if (players <= 0) {
                System.out.println("Sorry, the number of players must be greater than 0.");
                return;
            }

            String[] deck = new String[cardAmount];
            for (int i = 0; i < suits.length; i++) {
                for (int j = 0; j < ranks.length; j++) {
                    deck[i * ranks.length + j] = ranks[j] + " of " + suits[i];
                }
            }

            final Random random = new Random();
            for (int i = 0; i < deck.length; i++) {
                int index = random.nextInt(cardAmount);
                String temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }

            String[][] playersCard = new String[players][playerCardsAmount];
            for (int i = 0; i < players; i++) {
                for (int j = 0; j < playerCardsAmount; j++) {
                    playersCard[i][j] = deck[playerCardsAmount * i + j];
                }
            }

            for (int i = 0; i < players; ++i) {
                System.out.println("Player " + (i + 1) + "'s cards:");
                printDeck(playersCard[i]);
            }
        }
    }

    public static void printDeck(String[] deck) {
        for (String card : deck) {
            System.out.print(card + "\t");
        }
        System.out.println("\n");
    }
}


