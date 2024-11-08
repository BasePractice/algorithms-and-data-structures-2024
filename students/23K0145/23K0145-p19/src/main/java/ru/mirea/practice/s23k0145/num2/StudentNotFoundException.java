package ru.mirea.practice.s23k0145.num2;

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Студент с ФИО \"" + name + "\" не найден.");
    }
}
