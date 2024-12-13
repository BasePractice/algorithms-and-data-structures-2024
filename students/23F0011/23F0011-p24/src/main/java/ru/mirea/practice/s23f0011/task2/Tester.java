package ru.mirea.practice.s23f0011.task2;

public abstract class Tester {
    public static void main(String[] args) {
        ChairFactory factory = new ConcreteChairFactory();
        Client client = new Client();

        Chair victorianChair = factory.createVictorianChair();
        client.sit(victorianChair);

        Chair functionalChair = factory.createFunctionalChair();
        client.sit(functionalChair);

        Chair magicanChair = factory.createMagicanChair();
        client.sit(magicanChair);
    }
}
