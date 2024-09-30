package ru.mirea.practice.s0000001;

public enum Seasons {
    WINTER(-25) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };


    private final int averageTemp;

    Seasons(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public abstract String getDescription();

}