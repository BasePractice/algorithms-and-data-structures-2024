package ru.mirea.practice.s0000001.n5;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i9", 3.6);
        Memory memory = new Memory(16);
        Monitor monitor = new Monitor(27);
        Computer computer = new Computer(processor, memory, monitor, Brand.IRBIS);

        System.out.println(computer);
    }
}