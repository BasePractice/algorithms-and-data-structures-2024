package ru.mirea.practice.s23k0215.task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        CardIndex cardIndex = new CardIndex();

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            try (FileInputStream inputStream = new FileInputStream("example.txt")) {
                int data = inputStream.read();
                while (data != -1) {
                    System.out.print((char) data);
                    data = inputStream.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            do {
                System.out.println("1. Добавить элемент в картотеку");
                System.out.println("2. Показать все элементы картотеки");
                System.out.println("3. Выйти");
                System.out.print("Выберите действие: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        cardIndex.addElement(scanner);
                        break;
                    case 2:
                        cardIndex.displayAll();
                        break;
                    case 3:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Неверный выбор, попробуйте снова.");
                        break;
                }
            } while (choice != 3);
        }
    }
}


