package ru.mirea.practice.s230k754.lab4.task3;

public final class Task3 {
    private Task3() {}

    public static void main(String[] args) {
        Shopping karl = new Shopping("123", "123");
        karl.addCard("LEMON");
        karl.addCard("LEMON");
        karl.addCard("LEMON");

        karl.buyCard();
    }
}
