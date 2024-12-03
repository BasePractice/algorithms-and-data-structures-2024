package ru.mirea.practice.s23k0164.t1;

public final class First {

    private First() {

    }

    public enum Seasons {
        Winter("Зима", "Холодное время года, когда идет снег.", -20),
        Spring("Весна", "Время цветения и пробуждения природы.", 15),
        Summer("Лето", "Теплое время года, когда светит солнце.", 25),
        Autumn("Осень", "Время увядания природы и сбора урожая", 12);

        private final String name;
        private final String description;
        private final int temperature;

        Seasons(String name, String description, int temperature) {
            this.name = name;
            this.description = description;
            this.temperature = temperature;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public int getTemperature() {
            return temperature;
        }

        public static Seasons determineSeasonTemperature(int temperature) {
            if (temperature < 0) {
                return Winter;
            } else if (temperature < 15) {
                return Spring;
            } else if (temperature < 25) {
                return Autumn;
            } else {
                return Summer;
            }
        }
    }

    public static void printSeasonMessage(Seasons season) {
        switch (season) {
            case Winter:
                System.out.println("Я люблю зиму");
                break;
            case Spring:
                System.out.println("Я люблю весну");
                break;
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Autumn:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Неизвестное время года");
                break;
        }
    }

    public static void main(String[] args) {
        Seasons temperatureSeason = Seasons.determineSeasonTemperature(25);
        System.out.println("Время года по температуре: " + temperatureSeason.getName());
        System.out.println("Описание: " + temperatureSeason.getDescription());
        System.out.println("Температура: " + temperatureSeason.getTemperature());

        Seasons favoriteSeason = Seasons.Spring;
        System.out.println("Моё любимое время года: " + favoriteSeason.getName());
        System.out.println("Описание: " + favoriteSeason.getDescription());
        System.out.println("Температура: " + favoriteSeason.getTemperature());
        printSeasonMessage(Seasons.Spring);

        System.out.println("\nВсе времена года:");
        for (Seasons season : Seasons.values()) {
            System.out.println("Время года: " + season.getName());
            System.out.println("Описание: " + season.getDescription());
            System.out.println("Средняя температура: " + season.getTemperature() + "°C");
            System.out.println();
        }
    }
}
