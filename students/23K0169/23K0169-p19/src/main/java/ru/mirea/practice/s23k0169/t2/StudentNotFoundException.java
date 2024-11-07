package ru.mirea.practice.s23k0169.t2;

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Студент с ФИО \"" + name + "\" не найден.");
    }
}

