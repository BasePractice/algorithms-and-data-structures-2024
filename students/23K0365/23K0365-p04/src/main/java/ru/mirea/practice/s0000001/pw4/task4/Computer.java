package ru.mirea.practice.s0000001.pw4.task4;

public class Computer {
    Memory mem;
    Proccesor proc;
    Monitor mon;
    Brands bra;

    public Computer(Memory mem, Proccesor proc, Monitor mon, Brands bra) {
        this.mem = mem;
        this.proc = proc;
        this.mon = mon;
        this.bra = bra;
    }

    @Override
    public String toString() {
        return "Ur computer is included:\n"
                + "Memory: " + mem
                + "\nProcessor: " + proc
                + "\nMonitor: " + mon
                + "\nBrand is " + bra;
    }

    public Memory getMem() {
        return mem;
    }

    public Proccesor getProc() {
        return proc;
    }

    public Monitor getMon() {
        return mon;
    }

    public Brands getBra() {
        return bra;
    }
}