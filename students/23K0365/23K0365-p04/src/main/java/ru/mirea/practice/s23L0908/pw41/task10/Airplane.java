package ru.mirea.practice.s23L0908.pw41.task10;

public class Airplane extends Transport {
    private int wasteOfGasByLanding;

    public Airplane(int speed, int maxMass, int wasteOfGas, int wasteOfGasByLanding) {
        super(speed, maxMass, wasteOfGas);
        this.wasteOfGasByLanding = wasteOfGasByLanding;
    }

    @Override
    public int priceOfTranspotaionPeople(int numPeople, int averMass, int distace) {
        return (wasteOfGas * (distace / speed) * (numPeople * averMass)) / 10 + wasteOfGasByLanding;
    }

    @Override
    public int priceOfTranspotaionGoods(int numGoods, int averMass, int distace) {
        return (wasteOfGas * (distace / speed) * (numGoods * averMass)) / 10 + wasteOfGasByLanding;
    }

}
