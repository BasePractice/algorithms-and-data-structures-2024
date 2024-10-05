package ru.mirea.practice.s23L0908;

import java.util.Arrays;
import java.util.Scanner;

/*****************************************************************************
 * Разработайте класс Shop для, реализуйте методы добавления и               *
 * удаления компьютеров в магазине, добавьте метод поиска в магазине         *
 * компьютера, нужного пользователю. Протестируйте работу созданных классов. *
 * Данные для заполнения массива компьютеров вводятся с клавиатуры           *
 * пользователем. Для этого реализуйте интерфейс.                            *
 *****************************************************************************/

public abstract class Task4 {
    public static void main(String[] args) {
        Shop shop = new Shop(5);

        System.out.println("Компьютеры очень просты, нужно указать модель и цену при добавлениии в магазин.");

        for (int i = 0; i <= 5; ++i) {
            shop.addComp();
        }

        System.out.println(Arrays.toString(shop.computers));
    }

    static class Computer {
        double price;
        String model;

        public Computer() {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Введите модель компьютера: ");
                this.model = sc.nextLine();

                System.out.print("Введите цену для компьютера" + this.model + ": ");
                this.price = sc.nextDouble();
            }
        }

        @Override
        public String toString() {
            return "Компьютер { модель=" + model + "; цена=" + price + " }";
        }
    }

    static class Shop {
        Computer[] computers;
        private int am = 0;
        private final int maxCap;

        public Shop(int maxCap) {
            this.computers = new Computer[maxCap];
            this.maxCap = maxCap;
        }

        public void addComp() {
            if (am + 1 <= maxCap) {
                Computer comp = new Computer();
                System.out.println("На полку добавлен " + comp + ".");
                this.computers[this.am] = comp;
                this.am++;
            } else {
                System.out.println("Полки полностью заставлены компьютерами.");
            }
        }

        public void delComp(int pos) {
            if (pos >= 1 && pos <= am) {
                for (int i = pos; i <= am; ++i) {
                    this.computers[i] = this.computers[i + 1];
                }
                --am;
            } else {
                throw new IndexOutOfBoundsException("Компьютера в позиции " + pos + " не существует.");
            }
        }
    }
}
