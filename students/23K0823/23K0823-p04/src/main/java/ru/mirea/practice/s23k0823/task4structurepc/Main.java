package ru.mirea.practice.s23k0823.task4structurepc;

public abstract class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.2);
        Memory memory = new Memory(16);
        Monitor monitor = new Monitor(24, "Full HD");
        Computer computer = new Computer(Brand.DELL, processor, memory, monitor);

        computer.displayComputerInfo();
    }
}