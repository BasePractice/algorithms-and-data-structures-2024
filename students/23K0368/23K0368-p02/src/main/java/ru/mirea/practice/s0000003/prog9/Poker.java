package ru.mirea.practice.s0000003.prog9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class Poker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество игроков: ");
            int n = scanner.nextInt();

            // Проверка на корректность количества игроков
            if (n < 1 || n > 10) {
                System.out.println("Ошибка: число игроков должно быть от 1 до 10.");
                return;
            }

            // Создаем и перемешиваем колоду карт
            List<String> deck = createDeck();
            Collections.shuffle(deck);

            // Раздаем по 5 карт каждому игроку
            for (int i = 1; i <= n; i++) {
                System.out.println("Игрок " + i + ":");
                for (int j = 0; j < 5; j++) {
                    System.out.println(deck.remove(0)); // Раздаем карту
                }
                System.out.println(); // Пустая строка для разделения игроков
            }
        }
    }

    // Метод для создания колоды карт
    public static List<String> createDeck() {
        String[] suits = {"Черви", "Бубны", "Крести", "Пики"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        List<String> deck = new ArrayList<>();

        // Генерация колоды (52 карты)
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }
}

