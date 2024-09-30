package ru.mirea.practice.s0000001;

class Memory {
    private String type;
    private int size;

    public Memory(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Memory{"
                + "type='" + type + '\''
                + ", size=" + size + " GB"
                + '}';
    }
}
