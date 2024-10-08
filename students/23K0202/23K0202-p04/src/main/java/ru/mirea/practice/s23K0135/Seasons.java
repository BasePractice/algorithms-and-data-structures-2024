package ru.mirea.practice.s23K0135;


public abstract class Seasons {
    public static void main(String[] args) {
        Season myFavorite = Season.ВЕСНА;
        System.out.println("Мое любимое время года - " + myFavorite + "\nСредняя температура: " + myFavorite.getAverageTemperature()
                + "\nОписание: " + myFavorite.getDescription());

        myConfession(myFavorite);
        System.out.println("\nВсе времена годы: ");
        for (Season season : Season.values()) {
            System.out.println("\n" + season + ":\nСредняя температура: " + season.getAverageTemperature()
                    + "\nОписание: " + season.getDescription());
        }

    }

    public static void myConfession(Season season) {
        switch (season) {
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
            default:
                System.out.println("Неизвестный сезон");
                break;
        }
    }
}
