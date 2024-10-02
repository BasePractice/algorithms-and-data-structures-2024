package ru.mirea.practice.s0000001.task2;

class Display {
    private String displayResolution;
    private double displaySize;

    public Display(String displayResolution, double displaySize) {
        this.displayResolution = displayResolution;
        this.displaySize = displaySize;
    }

    public String getDisplayResolution() {
        return displayResolution;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    @Override
    public String toString() {
        return "Display{"
                + "displayResolution='" + displayResolution + '\''
                + ", displaySize=" + displaySize + " inches "
                + '}';
    }
}