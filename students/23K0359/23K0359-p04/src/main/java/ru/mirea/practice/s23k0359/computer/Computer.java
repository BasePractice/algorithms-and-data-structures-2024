package ru.mirea.practice.s23k0359.computer;

public class Computer {
    Processor processor;
    Memory memory;
    Monitor monitor;

    public Computer(Memory memory, Processor processor, Monitor monitor) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}