package ru.mirea.practice.s23k0089.task1;

public class Client {
    private String name;
    private String inn;

    public Client(String name, String inn) throws InvalidInnException {
        this.name = name;
        setInn(inn);
    }

    public void setInn(String inn) throws InvalidInnException {
        if (inn.length() != 10 && inn.length() != 12) {
            throw new InvalidInnException("Недействительный ИНН: " + inn);
        }
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public String getInn() {
        return inn;
    }
}

