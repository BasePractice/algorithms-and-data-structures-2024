package ru.mirea.practice.s23K0135.task10;

import java.util.Scanner;

public class Computer implements Insert {
    Memory mem;
    Proccesor proc;
    Monitor mon;
    Brands bra;


    @Override
    public void createComp() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Type memory(int,int,string):");
            this.mem = new Memory(sc.nextInt(), sc.nextInt());
            System.out.println("Type brand(string):");
            boolean falg = true;
            String temp;
            while (falg) {
                temp = sc.nextLine();
                for (Brands x : Brands.values()) {
                    if (x.name().equals(temp)) {
                        this.bra = x;
                        falg = false;
                    }
                }
            }
            System.out.println("Type processor(int,string):");
            this.proc = new Proccesor(sc.nextInt());
            System.out.println("Type monitor(int,int,string,string):");
            this.mon = new Monitor(sc.nextInt(), sc.nextInt());
        }
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
