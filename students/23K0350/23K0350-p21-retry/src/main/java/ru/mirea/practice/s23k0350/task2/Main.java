package ru.mirea.practice.s23k0350.task2;


abstract class Main {
    public static void main(String[] args) {
        AnyArrayElecBug<Object> test = new AnyArrayElecBug<>();
        TestHuman male = new TestHuman("Oleg", 35);
        test.add(10);
        test.add(male);
        test.add("Hello");
        test.add(true);
        test.add(3.14);
        System.out.println("Elements:");
        test.printElements();
        System.out.println("w/ Index:\n" + test.returnElement(1));

    }
}
