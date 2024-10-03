package ru.mirea.practice.s0000002.practice41.abstractclass.transport;

public abstract class Transport {
    public int speed;
    public Double time;
    public Double price;

    public Transport(int speed, Double time, Double price) {
        this.speed = speed;
        this.time = time;
        this.price = price;
    }

    abstract void time();

    abstract void coastforpeople();

    abstract void coastforgoods(); // стоимость груза
}
