package ru.mirea.practice.s0000001;

abstract class PhoneNumber {
    protected String rawNumber;

    public PhoneNumber(String rawNumber) {
        this.rawNumber = rawNumber;
    }

    public abstract String formatNumber();
}
