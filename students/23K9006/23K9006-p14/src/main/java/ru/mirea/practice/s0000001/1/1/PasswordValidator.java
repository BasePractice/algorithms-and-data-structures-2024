package ru.mirea.practice.s0000001;

abstract class PasswordValidator {
    protected String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    public abstract boolean isValid();
}
