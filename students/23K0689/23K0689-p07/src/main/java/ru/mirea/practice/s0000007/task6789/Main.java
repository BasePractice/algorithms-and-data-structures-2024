package ru.mirea.practice.s0000007.task6789;

public final class Main {

    private Main() {
        // Приватный конструктор для предотвращения создания экземпляров класса
    }

    public static void main(String[] args) {
        Printable[] printables = new Printable[] {
            new Book("Effective Java"),
            new Magazine("Java Magazine"),
            new Book("Clean Code"),
            new Magazine("Developer Weekly")
        };

        // Вывод названий книг и журналов
        ProcessStrings.printBooks(printables);
        Magazine.printMagazines(printables);

        // Тестирование класса ProcessStrings
        ProcessStrings processStrings = new ProcessStrings();
        String testString = "Hello, World!";

        int count = processStrings.countCharacters(testString);
        System.out.println("Number of characters: " + count);

        String oddChars = processStrings.getOddPositionCharacters(testString);
        System.out.println("Characters at odd positions: " + oddChars);

        String invertedString = processStrings.invertString(testString);
        System.out.println("Inverted string: " + invertedString);
    }
}