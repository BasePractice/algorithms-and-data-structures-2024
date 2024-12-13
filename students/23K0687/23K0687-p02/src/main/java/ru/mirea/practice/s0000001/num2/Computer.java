package ru.mirea.practice.s0000001.num2;

public class Computer {
    String name;
    String processor;
    int ram;
    int storage;

    public Computer(String name, String processor, int ram, int storage) {
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return name + " - " + processor + ", " + ram + "GB RAM, " + storage + "GB Storage";
    }
}
