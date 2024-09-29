package ru.mirea.practice.s23k0143;

public enum Season {
    ЗИМА(-15),
    ВЕСНА(10),
    ЛЕТО(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    ОСЕНЬ(15);

    int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    public static void main(String[] args) {
        Season favoriteSeason = Season.ЛЕТО;
        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        printSeasonMessage(favoriteSeason);

        for (Season season : Season.values()) {
            System.out.println(season + " - Средняя температура: " + season.getAverageTemperature() + ", Описание: " + season.getDescription());
        }
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case ВЕСНА:
                System.out.println("Я люблю весну");
                break;
            case ЛЕТО:
                System.out.println("Я люблю лето");
                break;
            case ОСЕНЬ:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Я не люблю это время года");
                break;
        }
    }
}
