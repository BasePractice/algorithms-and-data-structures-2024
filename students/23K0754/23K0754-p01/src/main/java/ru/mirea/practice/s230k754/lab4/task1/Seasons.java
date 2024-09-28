package ru.mirea.practice.s230k754.lab4.task1;

public enum Seasons {
    SUMMER(12),
    WINTER(23),
    SPRING(0),
    AUTUMN(9);

    private final int temperature;

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }


    public String getDescription() {
        if (this == SUMMER) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }
}
