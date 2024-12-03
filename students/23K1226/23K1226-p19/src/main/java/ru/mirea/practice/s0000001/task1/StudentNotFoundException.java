package ru.mirea.practice.s0000001.task1;

// 3. Исключение StudentNotFoundException
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
