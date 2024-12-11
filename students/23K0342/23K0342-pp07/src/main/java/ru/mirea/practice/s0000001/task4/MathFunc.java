package ru.mirea.practice.s0000001.task4;

public class MathFunc implements MathCalculable {

    @Override
    public Double compabs(double mnim, double deist) {
        return Math.sqrt(Math.pow(mnim,2) + Math.pow(deist,2));
    }

    @Override
    public Double[] compow(double n, double mod, double f) {
        Double[] set = new Double[2];
        set[0] = Math.pow(mod,n);
        set[1] = f * n;
        return set;
    }
}
