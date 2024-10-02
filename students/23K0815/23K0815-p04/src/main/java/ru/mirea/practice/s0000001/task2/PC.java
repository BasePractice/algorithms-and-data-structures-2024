package ru.mirea.practice.s0000001.task2;

class PC {
    private Brand brand;
    private Cpu processor;
    private Ram memory;
    private Display monitor;

    public PC(Brand brand, Cpu processor, Ram memory, Display monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    public Cpu getProcessor() {
        return processor;
    }

    public Ram getMemory() {
        return memory;
    }

    public Display getMonitor() {
        return monitor;
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

