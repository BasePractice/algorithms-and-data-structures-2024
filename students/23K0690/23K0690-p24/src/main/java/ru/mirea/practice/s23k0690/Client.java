package ru.mirea.practice.s23k0690;

class Client {
    private Chair chair;

    public Client(ChairFactory factory) {
        this.chair = factory.createChair();
    }

    public void sit() {
        chair.sit();
    }
}
