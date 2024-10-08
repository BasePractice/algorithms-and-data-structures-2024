package ru.mirea.practice.s23K0135.practice41.abstractclass.transport;

class Ship extends Transport {
    public Ship(int speed, Double time, Double price) {
        super(speed, time, price);
    }

    @Override
    void coastforgoods() {
        this.price = price * 2;
    }

    @Override
    void coastforpeople() {
        this.price = price * 3;
    }

    @Override
    void time() {
        this.time = time / 2;
    }

    @Override
    public String toString() {
        return "Ship{"
                + "speed=" + speed
                + ", time=" + time
                + ", price=" + price
                + '}';
    }
}
