package ru.mirea.practice.s23k0350.task1;


import ru.mirea.practice.s23k0350.task2.TestHuman;

abstract class Main {
    public static void main(String[] args) {
        AnyArray<Object> testing = new AnyArray<>();
        TestHuman female = new TestHuman("Natasha", 27);
        testing.add(10);
        testing.add("Hello");
        testing.add(true);
        testing.add(3.14);
        testing.add(female);
        System.out.println("Elements:");
        testing.printElements();
    }
}


