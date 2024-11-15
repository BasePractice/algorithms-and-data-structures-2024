package ru.mirea.practice.s23l0908.task123;

public class Client {
    private String name;
    private int inn;

    public Client() {
        this.name = "Phong";
        this.inn = 123;
    }

    public String getName() {
        return name;
    }

    public int getInn() {
        return inn;
    }

    @SuppressWarnings("unused")

    public void setName(String name) {
        this.name = name;
    }

    @SuppressWarnings("unused")

    public void setInn(int inn) {
        this.inn = inn;
    }
}

