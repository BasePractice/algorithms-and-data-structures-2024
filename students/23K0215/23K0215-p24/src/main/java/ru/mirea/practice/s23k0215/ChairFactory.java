package ru.mirea.practice.s23k0215;



class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(100);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
