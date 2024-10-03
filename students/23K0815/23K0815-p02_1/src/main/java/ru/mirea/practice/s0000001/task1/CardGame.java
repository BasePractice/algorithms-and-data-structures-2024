package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class CardGame {
    public static void main(String[] args) {
        String[] type = {"Пикlи", "Черви", "Крести", "Бубны"};
        String[] level = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};

        int n = 5;

        List<Cards> deck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new Cards(type[i], level[j]));
            }
        }

        Collections.shuffle(deck);

        for (int i = 0; i < n; i++) {
            System.out.print("Player " + (i + 1) + ": ");

            for (int j = 0; j < 5; j++) {
                System.out.print(deck.remove(0).getSuite() + " | " + deck.remove(0).getRank());

                if (j < 4) {
                    System.out.print(", ");
                }
            }

            System.out.println();
        }
    }
}