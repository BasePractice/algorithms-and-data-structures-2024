package ru.mirea.practice.s0000001.num2;

public class Computer {
    private Processor proc;
    private Memory mem;
    private Monitor mon;
    private Brand brand;

    public Computer(Processor proc, Memory mem, Monitor mon, Brand brand) {
        this.proc = proc;
        this.mem = mem;
        this.mon = mon;
        this.brand = brand;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + proc.getDetails());
        System.out.println("Memory: " + mem.getDetails());
        System.out.println("Monitor: " + mon.getDetails());
    }
}
