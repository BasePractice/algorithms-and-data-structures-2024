package ru.mirea.practice.s23k0350;

public class Season {
    public enum SeasonType {
        WINTER(-5, "Зима - холодное время года."),
        SPRING(10, "Весна - сначала холодное, потом теплое время года."),
        SUMMER(25, "Лето - теплое время года."),
        AUTUMN(15, "Осень - сначало теплое, потом холодное время года.");

        private final int averageTemperature;
        private final String description;

        SeasonType(int averageTemperature, String description) {
            this.averageTemperature = averageTemperature;
            this.description = description;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return description;
        }
    }

    private SeasonType season;

    public Season(SeasonType season) {
        this.season = season;
    }

    public void printSeasonInfo() {
        System.out.println("Информация о времени года:");
        System.out.println("---------------------------");
        System.out.printf("%-10s %1d%n", "Время года (температура):", season.getAverageTemperature());
        System.out.printf("%-10s %s%n", "Название:", season.name());
        System.out.printf("%-10s %s%n", "Описание:", season.getDescription());
    }

    public static void main(String[] args) {
        Season[] seasons = new Season[] {
            new Season(SeasonType.WINTER),
            new Season(SeasonType.SPRING),
            new Season(SeasonType.SUMMER),
            new Season(SeasonType.AUTUMN)
        };

        System.out.println("Информация о всех временах года:");
        System.out.println("--------------------------------");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println("Время года №" + (i + 1) + ":");
            seasons[i].printSeasonInfo();
            System.out.println();
        }

        System.out.println("\nПрограммно задаем время года:");
        Season currentSeason = new Season(SeasonType.SUMMER);
        currentSeason.printSeasonInfo();

        System.out.println("\nМетод getDescription():");
        System.out.println("---------------------");
        for (SeasonType seasonType : SeasonType.values()) {
            System.out.println(seasonType.name() + ": " + seasonType.getDescription());
        }
    }
}