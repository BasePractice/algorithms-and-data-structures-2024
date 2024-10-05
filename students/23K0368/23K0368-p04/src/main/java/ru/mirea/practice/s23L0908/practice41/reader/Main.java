package ru.mirea.practice.s23L0908.practice41.reader;

import java.time.LocalDate;

public abstract class Main {
    public static void main(String[] args) {
        // Создание массива объектов Reader
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Скрыпов", "А.", "А.", 123456, "Информатика", LocalDate.of(2005, 7, 7), "89012345678");
        readers[1] = new Reader("Максумов", "Т.", "Р.", 789012, "Математика", LocalDate.of(2005, 5, 5), "89123456789");
        readers[2] = new Reader("Пущенко", "А.", "Д.", 345678, "Физика", LocalDate.of(2005, 10, 10), "89234567890");

        // Вызов методов takeBook() и returnBook(), перегруженных методов
        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].takeBook(new Book("Приключения", "Иванов"), new Book("Словарь", "Петров"), new Book("Энциклопедия", "Сидоров"));
        readers[0].returnBook(3);
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].printBorrowedBooks();
    }
}
