package ru.mirea.practice.s0000001.task2;

public class Memorys {
    private String type;
    private int size;

    public Memorys(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Memory{"
                + "type='" + type + '\''
                + ", size=" + size
                + '}';
    }
}