package ru.mirea.practice.s0000001;

class Monitor {
    private String resolution;
    private double size;

    public Monitor(String resolution, double size) {
        this.resolution = resolution;
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Monitor{"
                + "resolution='" + resolution + '\''
                + ", size=" + size + " inches"
                + '}';
    }
}