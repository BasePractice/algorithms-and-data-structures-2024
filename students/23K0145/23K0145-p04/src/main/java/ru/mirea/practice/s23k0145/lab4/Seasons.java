package ru.mirea.practice.s23k0145.lab4;

public enum Seasons {
    WINTER(-20) {
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(15) {
        public String getDescription() {
            return "Прохладное время года";
        }
    },
    SUMMER(20) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10) {
        public String getDescription() {
            return "Прохладное время года";
        }
    };

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
