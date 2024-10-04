package ru.mirea.practice.s0000001.task1;

enum Season {
    WINTER(-5, "Холодное время года"),
    SPRING(10, "Теплое время года"),
    SUMMER(25, "Теплое время года"),
    AUTUMN(15, "Прохладное время года");

    private final int averageTemperature;
    private final String description;

    Season(int averageTemperature, String description) {
        this.averageTemperature = averageTemperature;
        this.description = description;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return description;
    }
}

class SeasonsTest {
    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());

        switch (favoriteSeason) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }

        for (Season season : Season.values()) {
            System.out.printf("%s: Средняя температура: %d, Описание: %s%n",
                    season, season.getAverageTemperature(), season.getDescription());
        }
    }
}