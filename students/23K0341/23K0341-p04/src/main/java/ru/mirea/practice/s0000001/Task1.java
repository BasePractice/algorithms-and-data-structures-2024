package ru.mirea.practice.s0000001;

/**
 * Задание 1. Времена года
 * Создать перечисление, содержащее названия времен года.
 * 1) Создать переменную, содержащую ваше любимое время года и
 * распечатать всю информацию о нем.
 * 2) Создать метод, который принимает на вход переменную созданного
 * вами enum типа. Если значение равно Лето, выводим на консоль “Я
 * люблю лето” и так далее. Используем оператор switch.
 * 3) Перечисление должно содержать переменную, содержащую среднюю
 * температуру в каждом времени года.
 * 4) Добавить конструктор, принимающий на вход среднюю температуру.
 * 5) Создать метод getDescription, возвращающий строку “Холодное время
 * года”. Переопределить метод getDescription - для константы Лето
 * метод должен возвращать “Теплое время года”.
 * 6) В цикле распечатать все времена года, среднюю температуру и
 * описание времени года
 */

public class Task1 {
    public static void main(String[] args) {
        Season favourite = Season.Summer;
        System.out.println("Тепло, лениво.");

        newMethod(favourite);

        System.out.println(Season.Spring.getDescription());
        System.out.println();

        for (Season season: Season.values()) {
            System.out.println(season);
            System.out.println(season.getDescription());
            System.out.println(season.getAvgTemp());
        }
    }

    static void newMethod(Season season) {
        switch (season) {
            case Autumn -> System.out.println("Скоро зима.");
            case Spring -> System.out.println("Скоро лето!");
            case Summer -> System.out.println("Люблю лето!");
            case Winter -> System.out.println("Холодновато, но скоро осень.");
            default -> System.out.println("Я не знаю... :(");
        }
    }
}
