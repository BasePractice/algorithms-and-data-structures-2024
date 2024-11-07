package mirea.lab7.p4;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double x, double y) {
        return Math.pow(x, y);
    }

    @Override
    public double modcomp(double x, double y) {
        return Math.sqrt(power(x, 2) + power(y, 2));
    }
}
