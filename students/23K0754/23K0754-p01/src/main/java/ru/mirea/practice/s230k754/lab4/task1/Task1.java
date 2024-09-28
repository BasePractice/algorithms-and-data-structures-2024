package ru.mirea.practice.s230k754.lab4.task1;

public final class Task1 {
    private Task1() {}

    public static void printMySeason(Seasons seasons) {
        switch (seasons) {
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

    public static void main(String[] args) {
        Seasons mySeason = Seasons.WINTER;
        printMySeason(mySeason);
        for (Seasons season : Seasons.values()) {
            System.out.printf("Сезон: %s, Cредняя температура: %d, %s\n", season, season.getTemperature(), season.getDescription());
        }
    }
}
