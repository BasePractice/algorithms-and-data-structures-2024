package ru.mirea.practice.s0000001.task2;

public class Client {
    private Chair c;

    public Client(Chair c) {
        this.c = c;
    }

    public void setChair(Chair c) {
        this.c = c;
    }

    public void toSit() {
        this.c.sitinOn();
    }

    public static void main(String[] args) {
        AbstractChairFactory creation = new AbstractChairFactory();
        Chair a = creation.createMagicChair();
        Client one = new Client(a);
        Chair b = creation.createVictorianChair(1234);
        Chair c = creation.createFunctionalChair();
        one.toSit();
        one.setChair(b);
        one.toSit();
        one.setChair(c);
        one.toSit();

    }
}
