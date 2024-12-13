package ru.mirea.practice.s0000001.num2;

public abstract class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.5);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("1920x1080", 24.0);
        Computer computer = new Computer(processor, memory, monitor, Brand.DELL);
        computer.showDetails();
    }
}
