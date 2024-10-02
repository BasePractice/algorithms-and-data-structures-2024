package ru.mirea.practice.s23k0823.task4structurepc;


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

    public void displayComputerInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("CPU: " + processor.getModel() + " " + processor.getFrequency() + " GHz");
        System.out.println("ОЗУ: " + memory.getCapacity() + " GB");
        System.out.println("Монитор: " + monitor.getSize() + " разрешение " + monitor.getResolution());
    }
}