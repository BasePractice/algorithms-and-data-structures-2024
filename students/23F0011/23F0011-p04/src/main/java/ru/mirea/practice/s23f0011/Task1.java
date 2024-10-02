package ru.mirea.practice.s23f0011;

public abstract class Task1 {
    public static void main(String[] args) {
        // 1) Мое любимое время года
        Season favoriteSeason = Season.ЗИМА;
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());
        System.out.println();

        // 2) Метод для вывода сообщения
        printSeasonMessage(Season.ЛЕТО);
        printSeasonMessage(Season.ЗИМА);
        System.out.println();

        // 6) Вывод всех времен года
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature());
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }

    // 2) Метод для вывода сообщения
    public static void printSeasonMessage(Season season) {
        switch (season) {
            case ЛЕТО:
                System.out.println("Я люблю лето!");
                break;
            case ЗИМА:
                System.out.println("Я люблю зиму!");
                break;
            case ВЕСНА:
                System.out.println("Я люблю весну!");
                break;
            case ОСЕНЬ:
                System.out.println("Я люблю осень!");
                break;
            default:
                break;
        }
    }

    public enum Season {
        ЗИМА(-10), ВЕСНА(5),
        ЛЕТО(20) {
            public String getDescription() {
                return "Теплое время года";
            }
        },
        ОСЕНЬ(10);

        private final int averageTemperature;

        // 4) Добавить конструктор, принимающий на вход среднюю температуру
        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return "Холодное время года";
        }

    }
}
