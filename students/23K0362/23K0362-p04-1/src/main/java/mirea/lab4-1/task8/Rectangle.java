package mirea.lab9.task8;

public class Rectangle extends Shape {
    private double wight;
    private double length;

    public Rectangle(String name, String color, boolean filled, double wight, double length) {
        super(name, color, filled);
        this.wight = Math.abs(wight) > 0 ? Math.abs(wight) : 1;
        this.length = Math.abs(length) > 0 ? Math.abs(length) : 1;
    }

    public Rectangle(String name, String color, boolean filled) {
        super(name, color, filled);
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        if (wight <= 0) {
            wight = getPositive("wight");
        }
        this.wight = wight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            length = getPositive("length");
        }
        this.length = length;
    }

    public double getArea() {
        return  wight * length;
    }

    public double getPerimeter() {
        return 2 * (wight + length);
    }


    @Override
    public String toString() {
        return "Rectangle{" + "wight=" + wight + ", length=" + length + ", Area=" + getArea()
                + ", Perimeter=" + getPerimeter() + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
