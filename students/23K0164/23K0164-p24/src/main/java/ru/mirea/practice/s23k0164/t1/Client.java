package ru.mirea.practice.s23k0164.t1;

public class Client {
    private Chair chair;

    public Client(ChairFactory factory) {
        this.chair = factory.createChair();
    }

    public void sit() {
        chair.sit();
    }
}
