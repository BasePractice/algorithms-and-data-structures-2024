package ru.mirea.practice.s0000007.task6789;

public class ProcessStrings implements StringOperations {

    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddPositionCharacters(String s) {
        StringBuilder oddChars = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) { // Нечетные позиции
                oddChars.append(s.charAt(i));
            }
        }
        return oddChars.toString();
    }

    @Override
    public String invertString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Статический метод для вывода названий книг
    public static void printBooks(Printable[] printables) {
        System.out.println("Books:");
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                System.out.println(printable.getTitle());
            }
        }
    }
}