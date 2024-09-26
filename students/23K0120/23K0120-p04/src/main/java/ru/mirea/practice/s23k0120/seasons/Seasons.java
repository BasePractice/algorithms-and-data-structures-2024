package ru.mirea.practice.s23k0120.seasons;

public enum Seasons {
    SUMMER(25f),
    AUTUMN(5f),
    WINTER(-10f),
    SPRING(15f);

    private final float temperature;

    Seasons(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    public static void like(Seasons season) {
        String seasonStr;
        switch (season) {
            case SUMMER:
                seasonStr = "лето";
                break;
            case SPRING:
                seasonStr = "весну";
                break;
            case AUTUMN:
                seasonStr = "осень";
                break;
            case WINTER:
                seasonStr = "зиму";
                break;
            default:
                seasonStr = "-";
                break;
        }
        System.out.printf("Я люблю %s\n", seasonStr);
    }

    public String getDescription() {
        String season;
        switch ((int) temperature) {
            case 25:
                season = "Тёплое";
                break;
            case 15:
                season = "Умеренное";
                break;
            case 5:
                season = "Прохладное";
                break;
            case -10:
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
        switch ((int) temperature) {
            case 25:
                season = "Лето";
                break;
            case 15:
                season = "Весна";
                break;
            case 5:
                season = "Осень";
                break;
            case -10:
                season = "Зима";
                break;
            default:
                season = "-";
                break;
        }
        return String.format("Время года - %s, Средняя температура - %.2f°C", season, this.temperature);
    }
}