package ru.mirea.practice.s0000001.n1;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        ConcrFactory factory = new ConcrFactory();
        Comx defComx = factory.createComx();
        Comx custComx = factory.createComx(3, 4);

        System.out.println(defComx);
        System.out.println(custComx);
    }
}
