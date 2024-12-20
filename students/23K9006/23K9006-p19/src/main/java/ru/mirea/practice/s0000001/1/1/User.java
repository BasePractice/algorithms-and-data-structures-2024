package ru.mirea.practice.s0000001;

public abstract class User {
    protected String name;
    protected String taxId;

    public User(String name, String taxId) {
        this.name = name;
        this.taxId = taxId;
    }

    public abstract void checkTaxId() throws InvalidTaxIdException;
}
