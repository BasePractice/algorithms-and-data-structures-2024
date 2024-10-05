package ru.mirea.practice.s23L0908.pw41.task10;

public abstract class Transport {
    protected int speed;
    protected int maxMass;
    protected int wasteOfGas;

    public abstract int priceOfTranspotaionPeople(int numPeople, int averMass, int distace);

    public abstract int priceOfTranspotaionGoods(int numGoods, int averMass, int distace);

    public Transport(int speed, int maxMass, int wasteOfGas) {
        this.speed = speed;
        this.maxMass = maxMass;
        this.wasteOfGas = wasteOfGas;
    }
}
