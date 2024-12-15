package ru.mirea.practice.s23k0135.task2;

public abstract class Test {
    public static void main(String[] args) {
        ChairFactory factory = new ConcreteChairFactory();
        Client client = new Client();

        Chair victorianChair = factory.createVictorianChair();
        client.sit(victorianChair);

        Chair functionalChair = factory.createFunctionalChair();
        client.sit(functionalChair);

        Chair magicalChair = factory.createMagicalChair();
        client.sit(magicalChair);
    }
}
