package ru.mirea.practice.s23k0690.task56;

import java.util.Scanner;

public abstract class Task5test {
    public static void main(String[] args) {
        Task5proces p = new Task56process();
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите текст: ");
            String text = in.nextLine();
            System.out.println("Количество символов в строке: " + p.con(text));
            System.out.println("Символы стоящие на нечетных позициях: " + p.add(text));
            System.out.println("Инверсированная строка: " + p.rev(text));
        } finally {
            in.close();
        }
    }
}