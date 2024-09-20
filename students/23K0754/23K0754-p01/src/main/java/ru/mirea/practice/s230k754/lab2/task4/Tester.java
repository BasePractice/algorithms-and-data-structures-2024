package ru.mirea.practice.s230k754.lab2.task4;

public final class Tester {
    private Tester() {}

    public static void main(String[] args) {
        Shop testShop = new Shop(3);

        testShop.append();
        testShop.append();
        testShop.append();

        System.out.printf("Результат поиска: %s", testShop.find("Computer 2") + '\n');
        testShop.pop();
        System.out.println(testShop.toString());
    }
}
