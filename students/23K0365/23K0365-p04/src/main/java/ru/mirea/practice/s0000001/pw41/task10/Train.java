package ru.mirea.practice.s0000001.pw41.task10;

public class Train extends Transport {
    @Override
    public int priceOfTranspotaionPeople(int numPeople, int averMass, int distace) {
        return wasteOfGas * distace;
    }

    @Override
    public int priceOfTranspotaionGoods(int numGoods, int averMass, int distace) {
        return wasteOfGas * distace;
    }

    public Train(int speed, int maxMass, int wasteOfGas) {
        super(speed, maxMass, wasteOfGas);
    }
}