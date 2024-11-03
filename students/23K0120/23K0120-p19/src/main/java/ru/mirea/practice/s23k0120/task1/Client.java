package ru.mirea.practice.s23k0120.task1;

public class Client {
    private String name;
    private String inn;

    public Client(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" + "name='" + name + '\'' + ", inn='" + inn + '\'' + '}';
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}
