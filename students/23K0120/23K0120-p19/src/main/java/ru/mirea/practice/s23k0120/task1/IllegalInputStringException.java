package ru.mirea.practice.s23k0120.task1;

public class IllegalInputStringException extends Exception {

    public IllegalInputStringException(String message) {
        super(message);
    }

    public IllegalInputStringException(String message, Throwable err) {
        super(message, err);
    }
}
