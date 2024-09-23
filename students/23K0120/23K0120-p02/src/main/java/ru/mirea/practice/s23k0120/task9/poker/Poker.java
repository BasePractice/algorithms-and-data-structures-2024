package ru.mirea.practice.s23k0120.task9.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public abstract class Poker {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        Deck deck = new Deck();
        Collections.shuffle(deck);

        //System.out.println(deck);

        System.out.print("Enter number of players: ");
        int numOfPlayers = 0;
        try (Scanner sc = new Scanner(System.in)) {

            numOfPlayers = sc.nextInt();
        }
        for (int i = 0; i < numOfPlayers; i++) {
            players.add(new Player());
        }

        for (int i = 0; i < 5 * numOfPlayers; i++) {
            players.get(i % numOfPlayers).add(deck.remove(deck.size() - 1));
        }

        for (int i = 0; i < numOfPlayers; i++) {
            System.out.printf("Player №%d: %s\n", i, players.get(i));
            System.out.print("\n");
        }
    }
}
