package ru.mirea.practice.s0000001;


import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author("Anna", "annabanana@pochta.com", 'W');
        System.out.println("Имя автора: " + author.getName() + '\n' + "Почта автора: "
                + author.getEmail() + "\n"  + "Пол автора: " + author.getGender());

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nВведите новую почту:");
            String newEmail = sc.next();
            author.setEmail(newEmail);
        }
        String sms2 = author.toString();
        System.out.println(sms2);
    }
}
