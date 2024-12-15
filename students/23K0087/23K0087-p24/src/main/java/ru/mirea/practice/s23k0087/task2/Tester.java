package ru.mirea.practice.s23k0087.task2;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ChairFactory chairFactory = new ChairFactory();
            Client client = new Client();

            System.out.println("Есть три стула: \n1. Викторианский\n2. Магический\n3. Функциональный\n"
                + "И на каждом можно сидеть!\nВыбирайте: ");
            int chairChoice = scanner.nextInt();

            switch (chairChoice) {
                case 1:
                    client.setChair(chairFactory.createVictorianChair());
                    break;
                case 2:
                    client.setChair(chairFactory.createMagicChair());
                    break;
                case 3:
                    client.setChair(chairFactory.createFunctionalChair());
                    break;
                default:
                    System.out.println("Нет такого стула.");
                    break;
            }
            client.sit();
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
