package ru.mirea.practice.s23l0908.Task4;

public class Computer implements Priceable {
    private double price;
    private int HDD;
    private int SDD;
    private String monitor;

    Computer(double price, int HDD, int SDD, String monitor) {
        this.price = price;
        this.HDD = HDD;
        this.SDD = SDD;
        this.monitor = monitor;
    }

    public void setPrice() {
        this.price = price;
    }

    public double getPrice(double price) {
        return price;
    }

    public void setHDD() {
        this.HDD = HDD;
    }

    public int getHDD(int HDD) {
        return HDD;
    }

    public void setSDD() {
        this.SDD = SDD;
    }

    public int getSDD(int SDD) {
        return SDD;
    }

    public void setMonitor() {
        this.monitor = monitor;
    }

    public String getMonitor(String monitor) {
        return monitor;
    }

    @Override
    public void getPrice() {
        System.out.println("This computer is" + this.price + "USD\n" +
            this.HDD + "gb HDD " + this.SDD + " gb RAM, and made by " + this.monitor);
    }

}
