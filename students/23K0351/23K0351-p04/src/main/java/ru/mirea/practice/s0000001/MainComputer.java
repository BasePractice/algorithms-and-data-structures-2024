package ru.mirea.practice.s0000001;

public abstract class MainComputer {
    public static void main(String[] args) {
        Processor processor = new Processor("AMD Ryzen 7 7800X", 8, 4.2);
        Memory memory = new Memory("DDR5", 16);
        Monitor monitor = new Monitor("1920x1080 ", 27.0);

        Computer computer = new Computer(Brand.ASUS, processor, memory, monitor);

        computer.printInformation();

    }
}