package ru.mirea.practice.s0000004.task1;

public enum SeasonsEnum {
    // Определяем времена года с указанием средней температуры
    WINTER(-5), SPRING(10), SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(15);

    // Переменная для хранения средней температуры
    private final int averageTemperature;

    // Конструктор, принимающий среднюю температуру
    SeasonsEnum(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    // Метод, возвращающий описание времени года
    public String getDescription() {
        return "Холодное время года";
    }

    // Геттер для средней температуры
    public int getAverageTemperature() {
        return averageTemperature;
    }
}