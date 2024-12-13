package ru.mirea.practice.s0000001.num1;

public enum Season {
    WINTER(-5), SPRING(10), SUMMER(25), FALL(15);

    private final int avgTemp;

    Season(int avgTemp) {
        this.avgTemp = avgTemp;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }

    public int getAvgTemp() {
        return avgTemp;
    }
}
