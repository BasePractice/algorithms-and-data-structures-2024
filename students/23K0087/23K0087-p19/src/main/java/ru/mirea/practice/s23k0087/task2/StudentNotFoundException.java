package ru.mirea.practice.s23k0087.task2;

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Студент " + name + " не найден.");
    }
}

