package ru.mirea.practice.s0000002.practice41.reader;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


// Класс Reader
class Reader {
    String firstName;
    String middleName;
    String lastName;
    int readerTicketNumber;
    String faculty;
    LocalDate birthDate;
    String phoneNumber;


    List<Book> borrowedBooks = new ArrayList<>();

    public Reader(String firstName, String middleName, String lastName, int readerTicketNumber, String faculty,
                  LocalDate birthDate, String phoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }



    // Метод для взятия книги (перегруженный)
    public void takeBook(int count) {
        System.out.println(lastName + " " + firstName + " " + middleName + " взял " + count + " книги.");
    }

    public void takeBook(String... bookNames) {
        System.out.print(lastName + " " + firstName + " " + middleName + " взял книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i]);
            if (i < bookNames.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(lastName + " " + firstName + " " + middleName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].name);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
            borrowedBooks.add(books[i]); // Добавляем книги в список
        }
        System.out.println();
    }

    //вернет все книги: которые когда либо брались
    public void printBorrowedBooks() {
        System.out.println("Взятые книги: ");
        for (Book book : borrowedBooks) {
            System.out.println(book.name + " (" + book.author + ")");
        }
    }

    // Метод для возврата книги (перегруженный)
    public void returnBook(int count) {
        System.out.println(lastName + " " + firstName + " " + middleName + " вернул " + count + " книги.");
    }

    public void returnBook(String... bookNames) {
        System.out.print(lastName + " " + firstName + " " + middleName + " вернул книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i]);
            if (i < bookNames.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}