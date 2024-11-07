package ru.mirea.practice.s0000004.task4;

public class Memory {
    private String type;    // Тип памяти (например, DDR4, DDR5)
    private int capacity;   // Объем памяти в ГБ

    public Memory(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Память: " + type + ", Объем: " + capacity + " ГБ";
    }
}
