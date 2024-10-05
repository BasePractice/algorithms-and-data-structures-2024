package ru.mirea.practice.s23L0908.prog10;

import java.util.Objects;

class Computer {
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

    // Getters
    public ComputerBrand getBrand() {
        return brand;
    }

    // Метод для вывода информации о компьютере
    public void printInfo() {
        System.out.println("Brand: " + brand.getBrand());
        System.out.println("Processor: " + processor.getNameProcessor() + " Производитель процессора "
                + processor.getCountCores() + " количество ядер");
        System.out.println("Memory: " + memory.getMemoryName() + " Производитель памяти " + memory.getMemorySize()
                + " Количество гигабайт");
        System.out.println("Monitor: " + monitor.getMonitopreName() + " фирма монитора " + monitor.getMonitoreSize()
                + " Количество дюймов");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Computer other = (Computer) obj;
        return brand == other.brand
                && processor.equals(other.processor)
                && memory.equals(other.memory)
                && monitor.equals(other.monitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, processor, memory, monitor);
    }
}


