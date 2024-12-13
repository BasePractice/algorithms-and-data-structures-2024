package ru.mirea.practice.s0000001.num2;

public class VictorianChairFactory implements ChairFactory {
    public Chair createChair() {
        return new VictorianChair();
    }
}
