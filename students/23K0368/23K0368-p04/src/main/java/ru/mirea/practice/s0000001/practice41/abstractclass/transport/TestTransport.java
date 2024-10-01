package ru.mirea.practice.s0000001.practice41.abstractclass.transport;

public abstract class TestTransport {
    public static void main(String[] args) {
        Car car = new Car(5, 10.0, 40.0);
        car.time();
        System.out.println(car);

    }
}
