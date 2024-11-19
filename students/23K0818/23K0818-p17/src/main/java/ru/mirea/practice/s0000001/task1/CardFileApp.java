package ru.mirea.practice.s0000001.task1;

public abstract class CardFileApp {
    public static void main(String[] args) {
        // Создаем объект студента, считывая данные с консоли
        Student student = Student.readFromConsole();

        System.out.println("\nИнформация о студенте:");
        student.printToConsole();
    }
}
