package ru.mirea.practice.s23K0135.prog4;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MathFunc implements MathCalculable {
    public Double radius;

    @Override
    public double powering(double a, double b) {
        return pow(a, b);
    }

    @Override
    public double abscomplex(double a, double b) {
        return sqrt(pow(a,2) + pow(b,2));
    }

    public MathFunc(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double sircleLenght() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "MathFunc{"
                + "radius=" + radius
                + '}';
    }
}
