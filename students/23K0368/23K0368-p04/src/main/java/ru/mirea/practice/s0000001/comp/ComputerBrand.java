package ru.mirea.practice.s0000001.comp;

enum ComputerBrand {
    IBM("IBM_701"), Apple("Apple_mac"), Lenovo("Yoga"), Microsoft("Serface"),
    Google("Pixel"), Elbrus("Apparat");
    private String brand;

    ComputerBrand(String model) {
        this.brand = model;
    }

    public String getBrand() {
        return brand;
    }

    public void set(String brand) {
        this.brand = brand;
    }
}
