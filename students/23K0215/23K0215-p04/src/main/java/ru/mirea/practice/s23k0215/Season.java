package ru.mirea.practice.s23k0215;

public enum Season {
    WINTER(-5) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(10) {
        @Override
        public String getDescription() {
            return "Прохладное время года";
        }
    },
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(15) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private int averageTemperature;

    // Конструктор
    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    // Геттер для средней температуры
    public int getAverageTemperature() {
        return averageTemperature;
    }

    // Абстрактный метод getDescription, который будет переопределен для каждого сезона
    public abstract String getDescription();

    public static void printFavoriteSeason(Season season) {
        switch (season) {
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
            default:
                System.out.println("Неизвестное время года");
                break;
        }
    }

    public static void main(String[] args) {
        // Мое любимое время года
        Season myFavorite = Season.SUMMER;
        System.out.println("Мое любимое время года: " + myFavorite);
        printFavoriteSeason(myFavorite);

        // Вывод всех времен года и их характеристик
        for (Season season : Season.values()) {
            System.out.println(season + " средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание: " + season.getDescription());
        }
    }
}
