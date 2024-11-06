package ru.mirea.practice.s0000001.task1;

class Computer {
    private String brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(String brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public String getBrand() {
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
}
