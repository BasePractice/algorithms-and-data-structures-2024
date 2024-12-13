package ru.mirea.practice.s0000001.task2;

public abstract class Main {
    public static void main(String[] args) {
        ChairFactory factory = new ConcreteChairFactory();
        Client client = new Client();

        VictorianChair victorianChair = factory.createVictorianChair(120);
        client.setChair(victorianChair);
        client.sit();
        System.out.println("Victorian chair age: " + victorianChair.getAge());

        MagicChair magicChair = factory.createMagicanChair();
        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();

        FunctionalChair functionalChair = factory.createFunctionalChair();
        client.setChair(functionalChair);
        client.sit();
        System.out.println("Functional chair sum: " + functionalChair.sum(5, 10));
    }
}
