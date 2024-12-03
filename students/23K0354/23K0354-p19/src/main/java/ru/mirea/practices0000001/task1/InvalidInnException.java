package ru.mirea.practices0000001.task1;

class InvalidInnException extends Exception {
    public InvalidInnException(String inn) {
        super("Недействительный ИНН: " + inn);
    }
}
