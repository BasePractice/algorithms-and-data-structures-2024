package ru.mirea.practice.s23l0908.Task4;

// Main.java
public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i7", 8, 3.8);
        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor("1920x1080", 24.0);
        Computer computer = new Computer(ComputerBrand.DELL, processor, memory, monitor);
        //    computer.displayDetails();
    }
}
