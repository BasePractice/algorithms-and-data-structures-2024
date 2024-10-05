package ru.mirea.practice.s23L0908.task1;

class Processor {
    private String brand;
    private double speed;

    public Processor(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return brand + " (" + speed + " ГГц)";
    }
}
