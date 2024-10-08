package ru.mirea.practice.s23K0135;

/**
 * Реализовать интерфейс Priceable, имеющий метод getPrice(),
 * возвращающий некоторую цену для объекта. Проверить работу для различных
 * классов, сущности которых могут иметь цену.
 */

public abstract class Task4 {
    public static void main(String[] args) {
        System.out.println("This is Task_'numba' template.");

        Apple apple = new Apple(10);
        Table table = new Table(99);

        System.out.println("Apple costs: " + apple.getPrice());
        System.out.println("Table costs: " + table.getPrice());
    }


    interface Priceable {
        int getPrice();
    }

    static class Apple implements Priceable {
        int price;

        Apple(int price) {
            this.price = price;
        }

        @Override
        public int getPrice() {
            return price;
        }
    }

    static class Table implements Priceable {
        int price;

        @Override
        public int getPrice() {
            return price;
        }

        Table(int price) {
            this.price = price;
        }
    }
}
