package ru.mirea.practice.s0000001.task4;

public class Shop {
    private String brand;
    private String cpu;
    private int price;
    private String gpu;

    public Shop(String brand, String cpu, int price, String gpu) {
        this.brand = brand;
        this.cpu = cpu;
        this.price = price;
        this.gpu = gpu;
    }

    public String getBrand() {
        return brand;
    }

    public String getcpu() {
        return cpu;
    }

    public int getPrice() {
        return price;
    }

    public String getgpu() {
        return gpu;
    }

    public Shop[] addComp(Shop[] arr, Shop newOne) {
        int len = arr.length;
        Shop[] newArr = new Shop[len + 1];
        for (int i = 0; i < len; i++) {
            newArr[i] = arr[i];
        }
        newArr[-1] = newOne;
        return newArr;
    }

    public Shop[] delComp(Shop[] arr, int cnt) {
        int len = arr.length;
        Shop[] newArr = new Shop[len - 1];
        for (int i = 0; i < len; i++) {
            if (i != cnt) {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    public void findExactByPrice(int priceMax, int priceMin) {
        if (priceMin <= this.price && this.price <= priceMax) {
            System.out.print("Ur option: " + toString());
        }
    }

    @Override
    public String toString() {
        return "Brand is " + brand + " with cpu - "
                + cpu + " and gpu - "
                + gpu + ". Price is " + price;
    }

}