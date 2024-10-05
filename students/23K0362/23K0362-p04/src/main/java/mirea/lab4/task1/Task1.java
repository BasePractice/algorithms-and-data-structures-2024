package mirea.lab9.task1;

/*
Задание 1. Времена года.
Создать перечисление, содержащее названия времен года.
1) Создать переменную, содержащую ваше любимое время года и
распечатать всю информацию о нем.
2) Создать метод, который принимает на вход переменную созданного
вами enum типа. Если значение равно Лето, выводим на консоль “Я
люблю лето” и так далее. Используем оператор switch.
3) Перечисление должно содержать переменную, содержащую среднюю
температуру в каждом времени года.
4) Добавить конструктор, принимающий на вход среднюю температуру.
5) Создать метод getDescription, возвращающий строку “Холодное время
года”. Переопределить метод getDescription - для константы Лето
метод должен возвращать “Теплое время года”.
6) В цикле распечатать все времена года, среднюю температуру и
описание времени года
 */

abstract class Task1 {
    public static void main(String[] args) {
        Seasons seasonsWinter = Seasons.WINTER;
        System.out.println(seasonsWinter.getLevelCode());
        System.out.println(seasonsWinter.getMeanTemperature());
        System.out.println(seasonsWinter.getDescriptionSeason(seasonsWinter));
        System.out.println(seasonsWinter.getDescription());
        Seasons seasonsSummer = Seasons.SUMMER;
        System.out.println(seasonsSummer.getDescriptionSeason(seasonsSummer));
        System.out.println(seasonsSummer.getDescription());

        seasonsWinter.printAllSeasons();
    }
}
