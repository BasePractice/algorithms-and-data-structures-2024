package ru.mirea.practice.s0000002;

enum Ex1 {
    WINTER(-10) {
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
    AUTUMN(5) {
        @Override
        public String getDescription() {
            return "Прохладное время года";
        }
    };

    private int averageTemperature;

    Ex1(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public static void main(String[] args) {
        Ex1 favoriteSeason = Ex1.AUTUMN;
        System.out.println("Мое любимое время года:");
        System.out.println("Название: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        printSeasonMessage(favoriteSeason);

        for (Ex1 season : Ex1.values()) {
            System.out.println(season + ": Средняя температура = " + season.getAverageTemperature()
                    + ", Описание = " + season.getDescription());
        }
    }

    public static void printSeasonMessage(Ex1 season) {
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
                System.out.println("Неизвестное время года");
                break;
        }
    }
}
