package ru.mirea.practice.s0000001.task2;

public abstract class Main {
    public static void main(String[] args) {

        ChairFactory factory = new ConcreteChairFactory();

        Client client = new Client();

        Chair victorianChair = factory.createVictorianChair();
        client.sit(victorianChair);

        Chair multifunctionalChair = factory.createMultifunctionalChair();
        client.sit(multifunctionalChair);

        Chair magicChair = factory.createMagicChair();
        client.sit(magicChair);
    }
}

