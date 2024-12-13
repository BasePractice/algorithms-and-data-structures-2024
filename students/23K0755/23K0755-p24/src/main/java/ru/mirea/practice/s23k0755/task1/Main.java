package ru.mirea.practice.s23k0755.task1;

import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        ChairFactory testFactory = new ChairFactory();
        MagicChair firstChair = testFactory.createMagicChair();
        firstChair.doMagic();
        Client tester = new Client();

        tester.setChair(firstChair);
        tester.sit();

        FunctinalChair secondChair = testFactory.createFunctinalChair();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите 2 числа");
            String[] string = scanner.nextLine().split(" ");
            int a = Integer.parseInt(string[0]);
            int b = Integer.parseInt(string[1]);
            System.out.println("Сумма " + a + " и " + b + " равна " + secondChair.sum(a, b));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        VictorianChair thirdChair = testFactory.createVictorianChair();
        thirdChair.victorianChair(123);
        System.out.println("Возраст стула:" + thirdChair.getAge());
    }
}
