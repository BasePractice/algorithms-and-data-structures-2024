package ru.mirea.practice.s23k0089.task1;

public enum Seasons {
    SUMMER(30f),
    AUTUMN(10f),
    WINTER(-5f),
    SPRING(20f);

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
        switch (this) {
            case SUMMER:
                season = "тёплое";
                break;
            case SPRING:
                season = "переходное из холодного в тёплое";
                break;
            case AUTUMN:
                season = "переходное из тёплого в холодное";
                break;
            case WINTER:
                season = "холодное";
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
        return String.format("Сезон - %s, средняя температура - %.2f°C", season, this.temperature);
    }
}