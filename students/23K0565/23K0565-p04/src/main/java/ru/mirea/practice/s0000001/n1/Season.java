package ru.mirea.practice.s0000001.n1;

public final class Season {

    private Season() {
        throw new UnsupportedOperationException("Utility class");
    }

    public enum Seasons {
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
        FALL(15) {
            @Override
            public String getDescription() {
                return "Прохладное время года";
            }
        };

        private final int avgTemp;

        Seasons(int temp) {
            this.avgTemp = temp;
        }

        public int getTemp() {
            return avgTemp;
        }

        public String getDescription() {
            return "Холодное время года";
        }
    }

    public static void printFavSeason(Seasons s) {
        switch (s) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case FALL:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Неизвестное время года");
                break;
        }
    }

    public static void main(String[] args) {
        Seasons favSeason = Seasons.SUMMER;
        System.out.println("Любимое время года: " + favSeason);
        System.out.println("Средняя температура: " + favSeason.getTemp());
        System.out.println(favSeason.getDescription());

        printFavSeason(favSeason);

        for (Seasons season : Seasons.values()) {
            System.out.println(season + " Средняя температура: " + season.getTemp() + " " + season.getDescription());
        }
    }
}
