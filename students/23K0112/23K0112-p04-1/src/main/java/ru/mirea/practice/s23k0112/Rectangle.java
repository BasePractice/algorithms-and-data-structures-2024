package ru.mirea.practice.s23k0112;

class Rectangle extends Shape {
    public int width;
    public int length;

    public Rectangle(String name, String color, boolean filled, int width, int length) {
        super(name, color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public double getPerimetr() {
        return 2 * (width + length);
    }

    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return super.toString() + "Side width: " + getWidth() + "\nSide length: " + getLength() + "\nPerimetr: "
                + getPerimetr() + "\nArea: " + getArea() + "\n";
    }
}
