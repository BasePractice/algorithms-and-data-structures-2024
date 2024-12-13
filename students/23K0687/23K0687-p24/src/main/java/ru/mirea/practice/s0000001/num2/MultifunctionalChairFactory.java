package ru.mirea.practice.s0000001.num2;

public class MultifunctionalChairFactory implements ChairFactory {
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
