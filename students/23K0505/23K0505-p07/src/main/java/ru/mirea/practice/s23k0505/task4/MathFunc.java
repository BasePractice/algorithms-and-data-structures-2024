package ru.mirea.practice.s23k0505.task4;

public class MathFunc implements MathCalculable {

    public double circleLength(double r) {
        return MathCalculable.PI * r;
    }

    public double exp(int x) {
        double res = MathCalculable.E;
        if (x > 0) {
            for (int i = 0; i < x; i++) {
                res *= MathCalculable.E;
            }
        } else {
            for (int i = 0; i >= x; i--) {
                res /= MathCalculable.E;
            }
        }
        return res;
    }

    public double pow(double x, int y) {
        double res = x;
        if (y > 0) {
            for (int i = 0; i < y; i++) {
                res *= x;
            }
        } else {
            for (int i = 0; i >= y; i--) {
                res /= x;
            }
        }
        return res;
    }

    public double complexLength(double re, double im) {
        return Math.sqrt(this.pow(re, 2) + this.pow(im, 2));
    }
}
