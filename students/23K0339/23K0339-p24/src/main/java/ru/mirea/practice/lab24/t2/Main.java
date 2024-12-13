package ru.mirea.practice.lab24.t2;

public abstract class Main {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();

        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();

        Chair victorianChair = factory.createVictorianChair(150);
        Chair multifunctionalChair = factory.createMultifunctionalChair();
        Chair magicalChair = factory.createMagicalChair();

        client1.setChair(victorianChair);
        client2.setChair(multifunctionalChair);
        client3.setChair(magicalChair);

        client1.sit();
        client2.sit();
        client3.sit();

        if (multifunctionalChair instanceof MultifunctionalChair) {
            MultifunctionalChair multifunctional = (MultifunctionalChair) multifunctionalChair;
            System.out.println("Сумма: " + multifunctional.sum(3, 4));
        }

        if (magicalChair instanceof MagicalChair) {
            MagicalChair magical = (MagicalChair) magicalChair;
            magical.doMagic();
        }
    }
}


