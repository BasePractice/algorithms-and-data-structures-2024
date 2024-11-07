package ru.mirea.practice.s23k0116.seasons;

public enum Seasons {
    WINTER(-10) {
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(15) {
        public String getDescription() {
            return "Прохладное время года";
        }
    },
    SUMMER(25) {
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    AUTUMN(10) {
        public String getDescription() {
            return "Прохладное время года";
        }
    };

    private int avarageTemp;

    Seasons(int avarageTemp) {
        this.avarageTemp = avarageTemp;
    }

    public int getAvarageTemp() {
        return avarageTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    public static void printfavoriteSeason(Seasons season) {
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
