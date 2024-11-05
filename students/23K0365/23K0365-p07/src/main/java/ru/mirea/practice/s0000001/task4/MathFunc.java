package ru.mirea.practice.s0000001.task4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(int x, int a) {
        double res = 1;
        if (a != 0) {
            for (int i = 0; i < a; i++) {
                res *= x;
            }
        }
        return res;
    }

    @Override
    public double moduleOfComplex(int a, int b) {
        return Math.sqrt(a * a - b * b);
    }
}
