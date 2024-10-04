package mirea.lab9.task8;

public class Square extends Rectangle {
    private double side;

    public Square(String name, String color, boolean filled, double side) {
        super(name, color, filled);
        this.side = Math.abs(side) > 0 ? Math.abs(side) : 1;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            side = getPositive("side");
        }
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public void setWight(double wight) {
        if (wight <= 0) {
            wight = getPositive("wight");
        }
        this.side = wight;
    }

    public void setLength(double length) {
        if (length <= 0) {
            length = getPositive("length");
        }
        this.side = length;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + ", Area=" + getArea() + ", Perimeter=" + getPerimeter()
                + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
