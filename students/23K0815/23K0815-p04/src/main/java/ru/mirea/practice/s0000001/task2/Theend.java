package ru.mirea.practice.s0000001.task2;

public final class Theend {

    private Theend() {
    }

    public static void main(String[] args) {
        Cpu processor = new Cpu("Apple M1", 16, 3.5);
        Ram memory = new Ram("LPDDR5", 16);
        Display monitor = new Display("24'' Retina", 16);

        PC computer = new PC(Brand.APPLE, processor, memory, monitor);

        System.out.println(computer);
    }
}
