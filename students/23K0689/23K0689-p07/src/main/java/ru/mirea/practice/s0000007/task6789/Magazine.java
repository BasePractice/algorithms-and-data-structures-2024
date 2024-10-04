package ru.mirea.practice.s0000007.task6789;

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
    public static void printMagazines(Printable[] printables) {
        System.out.println("Magazines:");
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                System.out.println(printable.getTitle());
            }
        }
    }
}
