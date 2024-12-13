package ru.mirea.practice.s23k0368.prog2;

public abstract class Main {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();

        VictorianChair victorianChair = factory.createVictorianChair(100);
        final MagicChair magicChair = factory.createMagicChair();
        final FunctionalChair functionalChair = factory.createFunctionalChair();

        Client client = new Client();

        client.setChair(victorianChair);
        client.sit();
        System.out.println("Возраст нашего пенсионерского стола " + victorianChair.getAge());

        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();

        client.setChair(functionalChair);
        client.sit();
        System.out.println("Сумма " + functionalChair.sum(5, 10));
    }
}
