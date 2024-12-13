package ru.mirea.practice.s0000001.task2;

public class Client {
    private Chair chair;

    public Client(ChairFactory factory) {
        this.chair = factory.createChair();
    }

    public void sit() {
        chair.sit();
    }

    public Chair getChair() {
        return chair;
    }

}
