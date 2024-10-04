package ru.mirea.practice.s23k0690;

public final class Task1sesons {

    private Task1sesons() {}

    public enum Seasons {
        SUMMER("Лето","ОЧЕНЬ Тепло и ОЧЕНЬ много солнца", 3000),
        AUTUMN("Осень", "Прохладно и дождливо", -5),
        WINTER("Зима", "ОЧЕНЬ Холодно и много снега", -273),
        SPRING("Весна", "Не холодно и все цветет", 6);

        private final String name;
        private final String ds;
        private final int tmp;

        Seasons(String name, String ds, int tmp) {
            this.name = name;
            this.ds = ds;
            this.tmp = tmp;
        }

        public String getName() {
            return name;
        }

        public String getDs() {
            return ds;
        }

        public int getTmp() {
            return tmp;
        }
    }



    public static void main(String[] args) {

        Seasons favourit = Seasons.WINTER;
        System.out.println("Любимый сезон: " + favourit.getName());
        System.out.println("Информация: " + favourit.getDs());

        switch (favourit) {
            case SUMMER:
                System.out.println("Я люблю лето!\n");
                break;
            case AUTUMN:
                System.out.println("Я НЕ люблю осень!\n");
                break;
            case WINTER:
                System.out.println("Я ОЧЕНЬ люблю зиму!\n");
                break;
            case SPRING:
                System.out.println("Я люблю весну!\n");
                break;
            default:
                System.out.println("ERROR!\n");
                break;
        }

        for (Seasons season: Seasons.values()) {
            System.out.printf("Название сезона: %s\n",season.getName());
            System.out.printf("Информация: %s\n",season.getDs());
            System.out.printf("Средняя температура: %d\n",season.getTmp());
            System.out.printf("\n");
        }

    }

}