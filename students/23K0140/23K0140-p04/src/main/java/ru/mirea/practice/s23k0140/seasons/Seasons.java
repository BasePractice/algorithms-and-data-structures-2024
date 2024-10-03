package ru.mirea.practice.s23k0140.seasons;

public enum Seasons {
    WINTER(-10, "Холодное время года"),
    SPRING(10, "Теплое время года"),
    SUMMER(25, "Теплое время года"),
    AUTUMN(15, "Холодное время года");

    private final int averageTemperature;
    private final String description;

    Seasons(int averageTemperature, String description) {
        this.averageTemperature = averageTemperature;
        this.description = description;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name() + ": " + description + ", средняя температура: " + averageTemperature + "°C";
    }

    public static void printSeasonMessage(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            default:
                break;
        }
    }
}