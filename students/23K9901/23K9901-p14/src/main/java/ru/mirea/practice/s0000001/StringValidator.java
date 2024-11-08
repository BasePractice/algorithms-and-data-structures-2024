package ru.mirea.practice.s0000001;


abstract class StringValidator {
    protected String inputString;

    public StringValidator(String inputString) {
        this.inputString = inputString;
    }

    public abstract boolean isValid();
}
