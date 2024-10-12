package ru.mirea.practice.s23k0135.seasons;

public enum Seasons {
    SUMMER(25),
    AUTUMN(5),
    WINTER(-10),
    SPRING(15);

    private final float temperature;

    Seasons(float temperature) {
        this.temperature = temperature;
    }

    public static void like(Seasons season) {
        String seasonStr;
        switch (season) {
            case SUMMER:
                seasonStr = "Лето";
                break;
            case SPRING:
                seasonStr = "Весну";
                break;
            case AUTUMN:
                seasonStr = "Осень";
                break;
            case WINTER:
                seasonStr = "Зиму";
                break;
            default:
                seasonStr = "-";
                break;
        }
        System.out.printf("Я люблю %s\n", seasonStr);
    }

    public float getTemperature() {
        return temperature;
    }

    public String getDescription() {
        String season;
        switch (this) {
            case SUMMER:
                season = "Тёплое";
                break;
            case SPRING:
                season = "Умеренное";
                break;
            case AUTUMN:
                season = "Прохладное";
                break;
            case WINTER:
                season = "Холодное";
                break;
            default:
                season = "-";
                break;
        }
        return String.format("%s время года", season);
    }

    @Override
    public String toString() {
        String season;
        switch (this) {
            case SUMMER:
                season = "Лето";
                break;
            case SPRING:
                season = "Весна";
                break;
            case AUTUMN:
                season = "Осень";
                break;
            case WINTER:
                season = "Зима";
                break;
            default:
                season = "-";
                break;
        }
        return String.format("Время года - %s, Средняя температура - %.2f°C", season, this.temperature);
    }
}
