package ru.mirea.practice.s0000001.practice41.abstractclass.transport;

class Car extends Transport {
    public Car(int speed, Double time, Double price) {
        super(speed, time, price);
    }

    @Override
    void time() {
        this.time = time / 4;
    }

    @Override
    void coastforpeople() {
        this.price = price * 6;
    }

    @Override
    void coastforgoods() {
        this.price = price * 6;
    }

    @Override
    public String toString() {
        return "Car{"
                + "speed=" + speed
                + ", time=" + time
                + ", price=" + price
                + '}';
    }
}
