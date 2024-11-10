package ru.mirea.practice.u23k1158;

class InvalidInnException extends Exception {
    public InvalidInnException(String inn) {
        super("Недействительный ИНН: " + inn);
    }
}