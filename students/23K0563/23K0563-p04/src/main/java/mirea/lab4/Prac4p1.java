package mirea.lab4;

/* Создать перечисление, содержащее названия времен года.
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

public abstract class Prac4p1 {
    public static String isFavorite(Seasons season) {
        switch (season) {
            case Winter:
                return "Я не люблю зиму";
            case Spring:
                return "Я не люблю Весну";
            case Summer:
                return "Я люблю Лето";
            case Autumn:
                return "Я не люблю осень";
            default:
                return "";
        }

    }

    public static void main(String[] args) {
        Seasons favseason = Seasons.Summer;
        System.out.println(isFavorite(favseason) + "\nОдно из четырёх времён года, между весной и осенью, "
                + "\nхарактеризующееся наиболее высокой температурой окружающей среды. "
                + "\nВ день летнего солнцестояния дни самые длинные, а ночи самые короткие.\n");
        Seasons[] season = {Seasons.Winter, Seasons.Spring, Seasons.Summer, Seasons.Autumn};
        for (int i = 0; i < 4; i++) {
            System.out.println(season[i].getSeason() + "\nСредняя температура: " + season[i].getTemp() + " °C\n" + season[i].getDescription() + "\n");
        }
    }
}
