package ru.mirea.practice.s23l0908.task4;

public class Computer {
    private final ComputerBrand brand;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @SuppressWarnings("unused")
    public ComputerBrand getBrand() {
        return brand;
    }

    @SuppressWarnings("unused")
    public Processor getProcessor() {
        return processor;
    }

    @SuppressWarnings("unused")
    public Memory getMemory() {
        return memory;
    }

    @SuppressWarnings("unused")
    public Monitor getMonitor() {
        return monitor;
    }
}
