package ru.mirea.practice.s23l0908.Task4;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable p1 = new Computer(800, 512, 16, "lenovo");
        p1.getPrice();

        p1 = new Telephone(400, 5, "Samsung", "red");
        p1.getPrice();

        Telephone n1 = new Telephone(200, 6, "Huawei", "yellow");
        n1.getPrice();
    }
}
