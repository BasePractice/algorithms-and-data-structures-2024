package ru.mirea.practice.s0000001.n5;

public class Computer {
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;
    private final Brand brand;

    public Computer(Processor processor, Memory memory, Monitor monitor, Brand brand) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.brand = brand;
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

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Компьютер: " + brand + ", Процессор: " + processor + ", Память: " + memory + ", Монитор: " + monitor;
    }
}