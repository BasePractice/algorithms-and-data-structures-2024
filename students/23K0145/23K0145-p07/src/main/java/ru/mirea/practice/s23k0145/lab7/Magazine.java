package ru.mirea.practice.s23k0145.lab7;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    // Статический метод для вывода названий журналов
    public static void printMagazines(Printable[] printable) {
        System.out.println("Список журналов:");
        for (Printable item : printable) {
            if (item instanceof Magazine) { // Проверяем, является ли объект журналом
                System.out.println(item.getTitle());
            }
        }
    }
}
