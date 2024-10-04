package ru.mirea.practice.s23k0359.season;

public enum Seasons {
    SUMMER(+24) {
        @Override
        public String getDescription() {
            return "Это тёплое время года";
        }
    },
    AUTUMN(+8),
    WINTER(-15),
    SPRING(+11);

    private final int temperature;

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return "Это холодное время года";
    }

    public void loveSeasons() {
        for (Seasons x: Seasons.values()) {
            switch (x) {
                case SPRING:
                    System.out.println("Я люблю весну");
                    break;
                case SUMMER:
                    System.out.println("Я люблю лето");
                    break;
                case AUTUMN:
                    System.out.println("Я люблю осень");
                    break;
                case WINTER:
                    System.out.println("Я люблю зиму");
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public String toString() {
        String season;
        switch (this) {
            case SUMMER:
                season = "Лето";
                break;
            case SPRING:
                season = "Весна";
                break;
            case AUTUMN:
                season = "Осень";
                break;
            case WINTER:
                season = "Зима";
                break;
            default:
                season = "empty";
                break;
        }
        return "Время года " + season + ". Средняя температура составляет " + this.temperature + "C.";
    }
}