package ru.mirea.practice.s0000001.prog1;

public abstract class Main {
    public static void main(String[] arg) {
        Students students = new Students("Иван", "Колесников", "Прокурор", 2,
                "SVO");

        System.out.println(students);
    }
}
