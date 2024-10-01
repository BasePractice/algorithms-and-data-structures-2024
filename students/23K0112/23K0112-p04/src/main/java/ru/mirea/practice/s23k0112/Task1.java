package ru.mirea.practice.s23k0112;

public final class Task1 {
    private Task1() {

    }

    public enum Seasons {
        SUMMER("Лето","Тепло и много солнца", 25),
        WINTER("Зима", "Холодно и много снега", -20),
        FALL("Осень", "Прохладно и дождливо", -5),
        SPRING("Весна", "Не холодно и все цветет", 6);

        private final String name;
        private final String description;
        private final int avgTemperature;

        Seasons(String name, String description, int avgTemperature) {
            this.name = name;
            this.description = description;
            this.avgTemperature = avgTemperature;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public int getAvgTemperature() {
            return avgTemperature;
        }
    }



    public static void main(String[] args) {
        // 1
        Seasons favouriteSeason = Seasons.SUMMER;
        System.out.println("Любимый сезон: " + favouriteSeason.getName());
        System.out.println("Информация: " + favouriteSeason.getDescription());

        // 2
        switch (favouriteSeason) {
            case SUMMER:
                System.out.println("Я люблю лето!\n");
                break;
            case FALL:
                System.out.println("Я люблю осень!\n");
                break;
            case SPRING:
                System.out.println("Я люблю весну!\n");
                break;
            case WINTER:
                System.out.println("Я люблю зиму!\n");
                break;
            default:
                System.out.println("Не известный сезон!\n");
                break;
        }

        // 3
        for (Seasons season: Seasons.values()) {
            System.out.printf("Название сезона: %s\nОписание: %s\nСредняя температура: %d\n\n", season.getName(),
                    season.getDescription(), season.getAvgTemperature());
        }

    }

}

