package ru.mirea.practice.s0000001;

import java.util.Scanner;
import java.util.Random;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Tester tester = new Tester(3);
            tester.addCircle(new Circle(new Point(0, 0), 5));
            tester.addCircle(new Circle(new Point(1, 1), 3));

            Shop shop = new Shop(5);
            for (int i = 0; i < 5; i++) {
                shop.addComputer(scanner.nextLine());
            }
            System.out.println(shop.searchComputer(scanner.nextLine()));

            DogKennel kennel = new DogKennel(3);
            kennel.addDog(new Dog("Барбос", 5));
            kennel.addDog(new Dog("Шарик", 3));
            for (Dog dog : kennel.getDogs()) {
                if (dog != null) {
                    System.out.println(dog.toString() + ", человеческий возраст: " + dog.getHumanAge());
                }
            }

            BookShelf shelf = new BookShelf(3);
            shelf.addBook(new Book("Автор1", "Книга1", 1999));
            shelf.addBook(new Book("Автор2", "Книга2", 2020));
            System.out.println("Старая книга: " + shelf.getOldestBook());
            System.out.println("Новая книга: " + shelf.getNewestBook());

            String[] array = {"one", "two", "three", "four"};
            for (int i = 0; i < array.length / 2; i++) {
                String temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            for (String s : array) {
                System.out.print(s + " ");
            }

            String[] suits = {"Черви", "Бубны", "Трефы", "Пики"};
            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
            String[] deck = new String[52];
            int index = 0;

            for (String suit : suits) {
                for (String rank : ranks) {
                    deck[index++] = rank + " " + suit;
                }
            }

            shuffleDeck(deck);

            int n = scanner.nextInt();
            dealCards(deck, n);

            scanner.nextLine();  // clear buffer
            String input = scanner.nextLine();
            String[] words = input.split("\\s+");
            System.out.println("Количество слов: " + words.length);
        }
    }

    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int j = rand.nextInt(deck.length);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public static void dealCards(String[] deck, int players) {
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(deck[i * 5 + j]);
            }
            System.out.println();
        }
    }
}
