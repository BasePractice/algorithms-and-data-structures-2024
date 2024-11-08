package ru.mirea.practice.s0000001;

public abstract class Client {
    protected String fullName;
    protected String inn;

    public Client(String fullName, String inn) {
        this.fullName = fullName;
        this.inn = inn;
    }

    // Abstract method to validate the INN
    public abstract void validateInn() throws InvalidInnException;
}
