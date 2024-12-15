package ru.mirea.practice.s0000001.task2;

public abstract class Test {
    public static void main(String[] args) {
        ChairFactory victorFactory = new VictorFactory();
        Client client1 = new Client(victorFactory);
        client1.sit();
        ChairFactory multiFactory = new MultiFactory();
        Client client2 = new Client(multiFactory);
        client2.sit();
        ChairFactory magicFactory = new MagicFactory();
        Client client3 = new Client(magicFactory);
        client3.sit();
    }
}
