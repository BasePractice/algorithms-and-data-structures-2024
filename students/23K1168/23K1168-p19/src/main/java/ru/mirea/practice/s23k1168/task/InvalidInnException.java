package ru.mirea.practice.s23k1168.task;

class InvalidInnException extends Exception {
    public InvalidInnException(String inn) {
        super("Недействительный ИНН: " + inn);
    }
}