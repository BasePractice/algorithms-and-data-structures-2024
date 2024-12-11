package ru.mirea.practice.s23k0143;

public abstract class TestFactory {
    public static void main(String[] args) {
        ChairFactory victorianChairFactory = new VictorianChairFactory();
        Client client1 = new Client(victorianChairFactory);
        client1.sit();

        ChairFactory multifunctionalChairFactory = new MultifunctionalChairFactory();

        Client client2 = new Client(multifunctionalChairFactory);
        client2.sit();

        ChairFactory magicalChairFactory = new MagicalChairFactory();
        Client client3 = new Client(magicalChairFactory);
        client3.sit();
    }
}
