package ru.mirea.practice.s23k0093;

class Memory {
    private String type;
    private int size; // ГБ

    public Memory(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Память: " + type + ", Объём: " + size + " ГБ";
    }
}