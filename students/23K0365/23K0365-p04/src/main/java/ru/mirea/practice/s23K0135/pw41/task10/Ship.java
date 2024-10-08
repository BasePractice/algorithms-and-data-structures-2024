package ru.mirea.practice.s23K0135.pw41.task10;

public class Ship extends Transport {
    @Override
    public int priceOfTranspotaionPeople(int numPeople, int averMass, int distace) {
        return (wasteOfGas * distace) * 4;
    }

    @Override
    public int priceOfTranspotaionGoods(int numGoods, int averMass, int distace) {
        return (wasteOfGas * distace) * 4;
    }

    public Ship(int speed, int maxMass, int wasteOfGas) {
        super(speed, maxMass, wasteOfGas);
    }
}
