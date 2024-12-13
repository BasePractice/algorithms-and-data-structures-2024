package ru.mirea.practice.s23k0823.task1.task1.task2;

public abstract class Main {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactoryImpl();
        Client client = new Client();

        client.setChair(factory.createVictorianChair());
        client.sit();

        client.setChair(factory.createMagicChair());
        client.sit();

    }
}