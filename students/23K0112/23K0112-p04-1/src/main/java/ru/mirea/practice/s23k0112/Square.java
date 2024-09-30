package ru.mirea.practice.s23k0112;

class Square extends Shape {
    public int sideSize;

    public Square(String name, String color, boolean filled, int sideSize) {
        super(name, color, filled);
        this.sideSize = sideSize;
    }

    public void setSide(int newSide) {
        this.sideSize = newSide;
    }

    public int getSide() {
        return sideSize;
    }

    public double getPerimetr() {
        return 4 * sideSize;
    }

    public double getArea() {
        return sideSize * sideSize;
    }

    @Override
    public String toString() {
        return super.toString() + "Side size: " + getSide() + "\nPerimetr: " + getPerimetr()
                + "\nArea: " + getArea() + "\n";
    }
}
