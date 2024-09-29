package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;


public class TestAuthor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            Author aut1 = new Author("Jonson", "jonson@mail.com", 'm');
            System.out.println(aut1.toString());
            aut1.setName("Boris");
            aut1.setEmail("boris@gmail.com");
            System.out.println(aut1.toString());
        }
    }
}
