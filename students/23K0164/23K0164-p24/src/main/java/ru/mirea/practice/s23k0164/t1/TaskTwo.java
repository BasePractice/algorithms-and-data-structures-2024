package ru.mirea.practice.s23k0164.t1;

public final class TaskTwo {
    private TaskTwo() {

    }

    public static void main(String[] args) {
        ChairFactory victorianFactory = new VictorianChairFactory();
        Client victorianClient = new Client(victorianFactory);
        victorianClient.sit();

        ChairFactory multifunctionalFactory = new MultifunctionalChairFactory();
        Client multifunctionalClient = new Client(multifunctionalFactory);
        multifunctionalClient.sit();

        ChairFactory magicFactory = new MagicChairFactory();
        Client magicClient = new Client(magicFactory);
        magicClient.sit();
    }

}
