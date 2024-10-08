package ru.mirea.practice.s23K0135.task2;

public final class Main {
    // Private constructor to prevent instantiation
    private Main() {
        // Prevent instantiation
    }

    public static void main(String[] args) {
        Processor processor = new Processor("Intel i7", 3.5);
        Memory memory = new Memory(16);
        Monitor monitor = new Monitor(27.0);

        Computer computer = new Computer(Brand.DELL, processor, memory, monitor);

        System.out.println(computer);
    }
}
