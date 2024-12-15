package ru.mirea.practice.s0000001;

abstract class DateValidator {
    protected String inputDate;

    public DateValidator(String inputDate) {
        this.inputDate = inputDate;
    }

    public abstract boolean isValid();
}
