package ru.mirea.practice.s23K0135.practice41.abstractclass.transport;

class Train extends Transport {
    public Train(int speed, Double time, Double price) {
        super(speed, time, price);
    }

    @Override
    void time() {
        this.time = time / 3;
    }

    @Override
    void coastforpeople() {
        this.price = price * 3;
    }

    @Override
    void coastforgoods() {
        this.price = price * 3;
    }

    @Override
    public String toString() {
        return "Train{"
                + "speed=" + speed
                + ", time=" + time
                + ", price=" + price
                + '}';
    }
}
