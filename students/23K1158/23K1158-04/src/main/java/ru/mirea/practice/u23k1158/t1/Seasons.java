package ru.mirea.practice.u23k1158.t1;

public enum Seasons {
    WINTER(-40) {
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(20) {
        public String getDescription() {
            return "Прохладное время года";
        }
    },
    SUMMER(30) {
        public String getDescription() {
            return "Жаркое время года";
        }
    },
    AUTUMN(15) {
        public String getDescription() {
            return "Дождливое время года";
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
