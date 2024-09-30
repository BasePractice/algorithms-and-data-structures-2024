package ru.mirea.practice.s23k0362.practice41.abstractclass.transport;

class Airplane extends Transport {
    public Airplane(int speed, Double time, Double price) {
        super(speed, time, price);
    }

    @Override
    void time() {
        this.time = time / 10;
    }

    @Override
    void coastforpeople() {
        this.price = price * 10;
    }

    @Override
    void coastforgoods() {
        this.price = price * 10;
    }

    @Override
    public String toString() {
        return "Airplane{"
                + "speed=" + speed
                + ", time=" + time
                + ", price=" + price
                + '}';
    }
}
