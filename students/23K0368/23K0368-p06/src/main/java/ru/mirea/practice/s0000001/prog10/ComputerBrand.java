package ru.mirea.practice.s0000001.prog10;

enum ComputerBrand {
    IBM("IBM"), Apple("Apple"), Lenovo("Lenovo"), Microsoft("Microsoft"),
    Google("Google"), Elbrus("Elbrus");

    private final String brand;

    ComputerBrand(String model) {
        this.brand = model;
    }

    public String getBrand() {
        return brand;
    }

}
