package ru.mirea.practice.s23k0093;

class Monitor {
    private String resolution;
    private int size; // Дюймы

    public Monitor(String resolution, int size) {
        this.resolution = resolution;
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Монитор: " + resolution + ", Размер: " + size + " дюймов";
    }
}