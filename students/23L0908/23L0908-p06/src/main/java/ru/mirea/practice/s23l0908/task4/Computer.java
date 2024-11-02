package ru.mirea.practice.s23l0908.task4;

public class Computer implements Priceable {
    private double price;
    private int hdd;
    private int sdd;
    private String monitor;

    Computer(double price, int hdd, int sdd, String monitor) {
        this.price = price;
        this.hdd = hdd;
        this.sdd = sdd;
        this.monitor = monitor;
    }

    @SuppressWarnings("unused")
    public void setPrice(double price) {
        this.price = price;
    }

    @SuppressWarnings("unused")
    public double getPrice(double price) {
        return price;
    }

    @Override
    public void getPrice() {
        System.out.println("This computer is" + this.price + "USD\n"
            + this.hdd
            + "gb HDD "
            + this.sdd
            + " gb RAM, and made by "
            + this.monitor);
    }

    @SuppressWarnings("unused")
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    @SuppressWarnings("unused")
    public int getHdd(int hdd) {
        return hdd;
    }

    @SuppressWarnings("unused")
    public void setSdd(int sdd) {
        this.sdd = sdd;
    }

    @SuppressWarnings("unused")
    public int getSdd(int sdd) {
        return sdd;
    }

    @SuppressWarnings("unused")
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @SuppressWarnings("unused")
    public String getMonitor(String monitor) {
        return monitor;
    }

}
