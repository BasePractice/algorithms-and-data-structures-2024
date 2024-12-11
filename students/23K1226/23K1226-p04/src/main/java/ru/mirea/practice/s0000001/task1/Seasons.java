package ru.mirea.practice.s0000001.task1;

enum Seasons {
    WINTER(-10), SPRING(10), SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(5);

    private final int averageTemperature;

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
