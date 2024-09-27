package ru.mirea.practice.s0000001;

enum Season{
    ЗИМА(-35) {
        public String getDescription() {
            return super.getDescription();
        }
    },
    ВЕСНА(20) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    ЛЕТО(35) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    ОСЕНЬ(10) {
        public String getDescription() {
            return super.getDescription();
        }
    };

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}

public class Seasons {
    public static void main(String[] args) {
        Season myFavorite = Season.ВЕСНА;
        System.out.println("Мое любимое время года - " + myFavorite + "\nСредняя температура: " + myFavorite.getAverageTemperature() + "\nОписание: " + myFavorite.getDescription());

        myConfession(myFavorite);
        System.out.println("\nВсе времена годы: ");
        for (Season season : Season.values()) {
            System.out.println("\n"+season + ":\nСредняя температура: " + season.getAverageTemperature() + "\nОписание: " + season.getDescription());
        }

    }

    public static void myConfession(Season season) {
        switch (season){
            case ЗИМА:
                System.out.println("Я люблю зиму");
                break;
            case ВЕСНА:
                System.out.println("Я люблю весну");
                break;
            case ЛЕТО:
                System.out.println("Я люблю лето");
                break;
            case ОСЕНЬ:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
