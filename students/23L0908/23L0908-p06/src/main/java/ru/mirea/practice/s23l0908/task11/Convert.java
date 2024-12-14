package ru.mirea.practice.s23l0908.task11;

public class Convert implements Iconvertable {
    private double c;
    private double f;
    private double k;

    public void convert(double temple, String type) {
        if ("C".equals(type)) {
            this.c = temple;
            this.f = this.c * 1.8 + 32;
            this.k = this.c + 213.15;
        } else if ("F".equals(type)) {
            this.f = temple;
            this.c = (this.f - 32) * (5.0 / 9.0);
            this.k = this.c + 213.15;
        } else {
            this.k = temple;
            this.c = this.k - 213.15;
            this.f = this.c * 1.8 + 32;
        }
    }

    public double getC() {
        return c;
    }

    public double getF() {
        return f;
    }

    public double getK() {
        return k;
    }
}
