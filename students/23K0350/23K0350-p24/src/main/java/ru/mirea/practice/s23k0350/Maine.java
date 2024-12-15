package ru.mirea.practice.s23k0350;

abstract class Maine {
    public static void main(String[] args) {
        Client client = new Client();

        ChairFactory victorianFactory = new VictorianChairFactory();
        Chair victorianChair = victorianFactory.createChair();
        client.sit(victorianChair);

        ChairFactory multifunctionalFactory = new MultifunctionalChairFactory();
        Chair multifunctionalChair = multifunctionalFactory.createChair();
        client.sit(multifunctionalChair);

        ChairFactory magicalFactory = new MagicalChairFactory();
        Chair magicalChair = magicalFactory.createChair();
        client.sit(magicalChair);
    }
}

