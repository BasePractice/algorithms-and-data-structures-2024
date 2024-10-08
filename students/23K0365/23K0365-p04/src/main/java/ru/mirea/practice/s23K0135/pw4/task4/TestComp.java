package ru.mirea.practice.s23K0135.pw4.task4;

public abstract class TestComp {
    public static void main(String[] args) {
        Computer a = new Computer(
            new Memory(144, 1024, "Life's good"),
            new Proccesor(165, "qwer"),
            new Monitor(27, 180, "IPS", "qaws"),
            Brands.AMD
        );
        System.out.println(a);
        System.out.println();
        a.mem.setInfo("asf");
        a.bra = Brands.INTEL;
        a.mon.setPicture("qazwsx");
        System.out.println(a);
    }
}
