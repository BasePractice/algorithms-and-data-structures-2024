package ru.mirea.practice.s0000004.task4;

public class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void displayInfo() {
        System.out.println("Информация о компьютере:");
        System.out.println("Марка: " + brand);
        System.out.println(processor);
        System.out.println(memory);
        System.out.println(monitor);
    }

    public static void main(String[] args) {
        // Создаем составные части компьютера
        Processor processor = new Processor("AMD", 4.05, 16);
        Memory memory = new Memory("DDR4", 18);
        Monitor monitor = new Monitor("3840x2160", 16);

        // Создаем компьютер с заданными компонентами
        Computer computer = new Computer(Brand.APPLE, processor, memory, monitor);

        // Выводим информацию о компьютере
        computer.displayInfo();
    }
}