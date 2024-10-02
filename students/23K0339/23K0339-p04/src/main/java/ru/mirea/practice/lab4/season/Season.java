package ru.mirea.practice.lab4.season;

public class Season {
    enum Seasons {
        WINTER(-5) {
            @Override
            public String getDescription() {
                return "Холодное время года";
            }
        },
        SPRING(10) {
            @Override
            public String getDescription() {
                return "Холодное время года";
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

        private final int averageTemperature;

        Seasons(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public static void printFavoriteSeason(Seasons seasons) {
            switch (seasons) {
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
                    System.out.println("Я ничего не люблю...");
                    break;
            }
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return "Холодное время года";
        }
    }

}
