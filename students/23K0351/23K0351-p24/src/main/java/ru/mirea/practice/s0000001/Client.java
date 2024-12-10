package ru.mirea.practice.s0000001;

public class Client {
    private Chair chair;

    public Client(ChairFactory factory) {
        this.chair = factory.createChair();
    }

    public void sit() {
        chair.sit();
    }

    public static void main(String[] args) {
        Client client1 = new Client(new VictorianChairFactory());
        client1.sit();

        Client client2 = new Client(new MultifunctionalChairFactory());
        client2.sit();

        Client client3 = new Client(new MagicalChairFactory());
        client3.sit();
    }
}
