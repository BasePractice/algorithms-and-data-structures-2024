package ru.mirea.practice.s0000001.num2;

public abstract class Main {

    public static void main(String[] args) {
        ChairFactory factory = new VictorianChairFactory();
        Chair chair = factory.createChair();
        Client client = new Client();
        client.sit(chair);

        factory = new MultifunctionalChairFactory();
        chair = factory.createChair();
        client.sit(chair);

        factory = new MagicalChairFactory();
        chair = factory.createChair();
        client.sit(chair);
    }
}
