package ru.mirea.practice.s23k0093;

public abstract class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i7", 8, 3.6);
        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor("1920x1080", 27);
        Computer computer = new Computer(Brand.DELL, processor, memory, monitor);

        System.out.println(computer);
    }
}
