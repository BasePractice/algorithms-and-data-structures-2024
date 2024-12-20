package ru.mirea.practice.s23k0135;

import java.util.Scanner;

public final class Test {
    private Test() {
        throw new UnsupportedOperationException("Утилитный класс");
    }

    public static void main(String[] args) {
        TreeProcessor tree = new TreeProcessor();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Меню:");
                System.out.println("1 - Добавить узел");
                System.out.println("2 - Удалить узел");
                System.out.println("3 - Вывести вариант 1 (снизу вверх, слева направо)");
                System.out.println("4 - Вывести вариант 2 (сверху вниз, слева направо)");
                System.out.println("5 - Вывести вариант 3 (левый, корень, правый)");
                System.out.println("6 - Вывести вариант 6 (уровни с номерами уровней)");
                System.out.println("7 - Выход");
                System.out.print("Введите команду: ");
                int command = scanner.nextInt();

                switch (command) {
                    case 1:
                        System.out.print("Введите значение для добавления: ");
                        int valueToAdd = scanner.nextInt();
                        tree.insert(valueToAdd);
                        break;

                    case 2:
                        System.out.print("Введите значение для удаления: ");
                        int valueToRemove = scanner.nextInt();
                        tree.remove(valueToRemove);
                        break;

                    case 3:
                        tree.printMethod1();
                        break;

                    case 4:
                        tree.printMethod2();
                        break;

                    case 5:
                        tree.printMethod3();
                        break;

                    case 6:
                        tree.printMethod6();
                        break;

                    case 7:
                        System.out.println("Выход из программы.");
                        return;

                    default:
                        System.out.println("Неверная команда.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
