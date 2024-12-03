package ru.mirea.practice.s0000001.task2;

public class Comp {
    private Brands brand;
    private Processor processor;
    private Memorys memory;
    private Monitors monitor;

    public Comp(Brands brand, Processor processor, Memorys memory, Monitors monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brands getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memorys getMemory() {
        return memory;
    }

    public Monitors getMonitor() {
        return monitor;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setMemory(Memorys memory) {
        this.memory = memory;
    }

    public void setMonitor(Monitors monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{"
                + "brand=" + brand
                + ", processor=" + processor
                + ", memory=" + memory
                + ", monitor=" + monitor
                + '}';
    }
}