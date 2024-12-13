package ru.mirea.practice.s0000001.n2;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Client client = new Client();

        VictorianChair victorianChair = factory.createVictorianChair(100);
        client.setChair(victorianChair);
        client.sit();
        System.out.println("Victorian Chair Age: " + victorianChair.getAge());

        final MagicChair magicChair = factory.createMagicanChair(); // final для уменьшения предупреждений
        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();

        final FunctionalChair functionalChair = factory.createFunctionalChair(); // final для уменьшения предупреждений
        client.setChair(functionalChair);
        client.sit();
        System.out.println("Sum result: " + functionalChair.sum(5, 10));
    }
}
