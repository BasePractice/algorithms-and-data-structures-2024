package ru.mirea.practice.s0000001.season;

public abstract class Main {
    enum Season {
        Summer(30), Winter(-5), Autumn(10), Spring(20);
        private double temt;

        Season(double temt) {
            this.temt = temt;
        }

        public double getDescription() {
            return temt;
        }

        public String tempmetod() {
            switch (this) {
                case Summer:
                    return "Теплое время года";
                default:
                    return "Холодное время года";
            }
        }
    }

    public static void getDescription(Season per) {
        switch (per) {
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Winter:
                System.out.println("Зима - время чистить снег((((");
                break;
            case Autumn:
                System.out.println("Осень - время собирать урожай");
                break;
            case Spring:
                System.out.println("Время кататься на квадроциклах)))))");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println(Season.Summer);

        Season year = Season.Spring;
        System.out.println(year);

        System.out.println();
        getDescription(year);

        System.out.println();
        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.tempmetod() + " " + season.getDescription());
        }

    }
}