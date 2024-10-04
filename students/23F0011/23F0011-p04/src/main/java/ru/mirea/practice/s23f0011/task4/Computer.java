package ru.mirea.practice.s23f0011.task4;

public class Computer {
    private final Brand brand;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7-12700K", 12, 5.0);
        Memory memory = new Memory(16, "DDR5");
        Monitor monitor = new Monitor(27, "1920x1080");
        Computer computer = new Computer(Brand.LENOVO, processor, memory, monitor);

        System.out.println(computer);
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

    public String toString() {
        return "Computer {" + "\nbrand=" + brand + "\nprocessor=" + processor + "\nmemory=" + memory + "\nmonitor=" + monitor + "\n}";
    }

    public enum Brand {
        ASUS, DELL, HP, LENOVO, APPLE
    }
}
