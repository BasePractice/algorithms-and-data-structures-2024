package ru.mirea.practice.s23K0135;

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

    @Override
    public String toString() {
        return "Computer{" + "brand=" + brand + ", " + processor + ", " + memory + ", " + monitor + '}';
    }

    public Brand getBrand() {
        return brand;
    }
}

