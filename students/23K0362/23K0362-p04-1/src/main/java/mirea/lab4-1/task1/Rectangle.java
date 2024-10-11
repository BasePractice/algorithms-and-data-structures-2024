package mirea.lab9.task1;

public class Rectangle extends Shape {
    private double lenA;
    private double lenB;

    public Rectangle(String name, double lenA, double lenB) {
        super(name);
        this.lenA = Math.abs(lenA) > 0 ? Math.abs(lenA) : 1;
        this.lenB = Math.abs(lenB) > 0 ? Math.abs(lenB) : 1;
    }

    public double getLenA() {
        return lenA;
    }

    public void setLenA(double lenA) {
        if (lenA <= 0) {
            lenA = getPositive("lenA");
        }
        this.lenA = lenA;
    }

    public double getLenB() {
        return lenB;
    }

    public void setLenB(double lenB) {
        if (lenB <= 0) {
            lenB = getPositive("lenB");
        }
        this.lenB = lenB;
    }

    public double getArea() {
        return  lenA * lenB;
    }

    public double getPerimeter() {
        return 2 * (lenA + lenB);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "lenA=" + lenA + ", lenB=" + lenB
                + ", Area=" + getArea() + ", Perimeter=" + getPerimeter() + '}';
    }
}
