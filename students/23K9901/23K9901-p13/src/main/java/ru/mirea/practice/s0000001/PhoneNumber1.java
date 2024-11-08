package ru.mirea.practice.s0000001;

abstract class PhoneNumber1 {
    protected String rawNumber;

    public PhoneNumber1(String rawNumber) {
        this.rawNumber = rawNumber;
    }

    public abstract String formatNumber();
}
