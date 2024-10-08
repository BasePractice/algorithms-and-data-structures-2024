package ru.mirea.practice.s23K0135.pw41.task10;

public class Auto extends Transport {

    @Override
    public int priceOfTranspotaionPeople(int numPeople, int averMass, int distace) {
        return wasteOfGas * (distace / speed) * (numPeople * averMass);
    }

    @Override
    public int priceOfTranspotaionGoods(int numGoods, int averMass, int distace) {
        return wasteOfGas * (distace / speed) * (numGoods * averMass);
    }

    public Auto(int speed, int maxMass, int wasteOfGas) {
        super(speed, maxMass, wasteOfGas);
    }
}
