package ru.mirea.practice.s23K0135;

public abstract class First {
    public enum Seasons {
        SUMMER(27, "Теплое"),
        AUTUMN(15, "Холодное"),
        WINTER(-5, "Холодное"),
        SPRING(17, "Холодное")
        ;
        private final int avtemp;

        Seasons(int avtemp, String description) {
            this.avtemp = avtemp;
            this.description = description;
        }

        public int getAvtemp() {
            return this.avtemp;
        }

        private final String description;

        public String getDescription() {
            return this.description + " время года";
        }
    }

    public static void main(String[] args) {
        Seasons season = Seasons.WINTER;
        String s = "";
        switch (season) {
            case SUMMER:
                s = "лето";
                break;
            case AUTUMN:
                s = "осень";
                break;
            case WINTER:
                s = "зиму";
                break;
            case SPRING:
                s = "весну";
                break;
            default:
                s = "";
                break;
        }
        System.out.println("Я люблю " + s);
        System.out.println(season.getAvtemp());
        String[] m = new String[]{"SUMMER","AUTUMN","WINTER","SPRING"};
        for (int i = 0;i < 4;i++) {
            season = Seasons.valueOf(m[i]);
            System.out.print(season.toString() + ": ");
            System.out.print(season.getAvtemp() + ", ");
            System.out.println(season.getDescription());
        }
    }
}
