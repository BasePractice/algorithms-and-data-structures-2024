package ru.mirea.practice.s23k0087;

public abstract class Task1 {
    public enum Season {
        WINTER("Зима", "Холодно и всё в снегу", -5),
        SPRING("Весна", "Теплеет, на улице свежо", 10),
        SUMMER("Лето", "Тепло и кайфово", 20),
        AUTUMN("Осень", "Промозгло, дождливо и серо", 5);

        private final String name;
        private final String description;
        private final int averageTemperature;

        Season(String name, String description, int averageTemperature) {
            this.name = name;
            this.description = description;
            this.averageTemperature = averageTemperature;
        }

        public String getName() {
            return name;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года: " + favoriteSeason.getName());
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());

        printSeasonInfo(favoriteSeason);


        for (Season season : Season.values()) {
            System.out.println(season.getName() + ":");
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }

    public static void printSeasonInfo(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            default:
                System.out.println("Нет такого сезона!");
                break;
        }
    }
}
