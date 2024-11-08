package ru.mirea.practice.s23k0130.task1;

class InvalidInnException extends Exception {
    public InvalidInnException(String inn) {
        super("Недействительный ИНН: " + inn);
    }
}