package ru.mirea.practice.s23L0908.task1;

public enum SeasonEnum {
    WINTER(-10),
    SPRING(20),
    SUMMER(30) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    FALL(8);

    private final int averageTemperature;

    SeasonEnum(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
