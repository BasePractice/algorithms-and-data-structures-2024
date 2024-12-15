package ru.mirea.practice.s23k0130.task2;

import java.util.Locale;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ChairFactory chairFactory = new ChairFactory();
            Client client = new Client();

            System.out.println("Выберите тип стула: викторианский, магический или функциональный");
            String chairChoice = scanner.nextLine().toLowerCase(Locale.ROOT);

            switch (chairChoice) {
                case "викторианский":
                    client.setChair(chairFactory.createVictorianChair());
                    break;
                case "магический":
                    client.setChair(chairFactory.createMagicChair());
                    break;
                case "функциональный":
                    client.setChair(chairFactory.createFunctionalChair());
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
            client.sit();
        }
    }
}
