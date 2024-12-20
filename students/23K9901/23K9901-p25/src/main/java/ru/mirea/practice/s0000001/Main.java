package ru.mirea.practice.s0000001;

abstract class Main {
    public static void main(String[] args) {
        ChairFactory factory = new ConcreteChairFactory();
        Client client = new Client();

        Chair victorianChair = factory.createVictorianChair(100);
        client.sit(victorianChair);

        MultifunctionalChair multifunctionalChair = factory.createMultifunctionalChair();
        client.sit(multifunctionalChair);
        multifunctionalChair.transform();

        MagicChair magicChair = factory.createMagicChair();
        client.sit(magicChair);
        magicChair.doMagic();
    }
}
