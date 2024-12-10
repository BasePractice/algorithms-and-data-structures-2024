package ru.mirea.practice.s29k0112.task2;

public final class TestChairFactory {
    private TestChairFactory() {

    }

    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();

        // Magic Chair
        Chair magicChair = chairFactory.createMagicChair();
        magicChair.sit();
        magicChair.setChair(chairFactory.createMagicChair());
        ((MagicChair) magicChair).doMagic();
        System.out.println('\n');

        // Functional Chair
        Chair funcChair = chairFactory.createFunctionalChair();
        funcChair.sit();
        funcChair.setChair(chairFactory.createFunctionalChair());
        System.out.println(((FunctionalChair) funcChair).sum(2, 3));
        System.out.println('\n');

        // Victorian Chair
        Chair victorianChair = chairFactory.createVictorianChair(100);
        victorianChair.sit();
        victorianChair.setChair(chairFactory.createVictorianChair(40));
        System.out.println(((VictorianChair) victorianChair).getAge());
    }
}
