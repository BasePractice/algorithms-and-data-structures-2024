package ru.mirea.practice.s23k0368.prog3;

public abstract class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(10);

        for (int i = 0; i <= 5; i++) {
            myList.add(i);
        }

        System.out.println("Элементы списка:");
        for (int num : myList) {
            System.out.print(num + " ");
        }
    }
}
