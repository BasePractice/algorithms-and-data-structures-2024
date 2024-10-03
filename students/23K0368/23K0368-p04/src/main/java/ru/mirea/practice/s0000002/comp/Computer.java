package ru.mirea.practice.s0000002.comp;

public abstract class Computer {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7-12700K", "Прямой",
                                 2000.0, 10, 12,
                                 "3 уровня", 64.0);
        Memory memory = new Memory("Samsung", "DDR5", 16.0, 3200);
        Monitor monitor = new Monitor("LG", "18:9", "27 inch",
                      "1920x1080", 16, 3200, 4.0);

        Computerr computer = new Computerr(ComputerBrand.IBM, processor, memory, monitor);
        computer.printInfo();

    }
}
