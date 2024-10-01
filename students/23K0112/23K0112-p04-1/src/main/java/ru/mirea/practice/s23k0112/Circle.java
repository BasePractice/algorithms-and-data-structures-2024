package ru.mirea.practice.s23k0112;

class Circle extends Shape {
    public int radius;

    public Circle(String name, String color, boolean filled, int radius) {
        super(name, color, filled);
        this.radius = radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public int getRadius() {
        return radius;
    }

    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "Radius: " + getRadius() + "\nPerimetr: "
                + getPerimetr() + "\nArea: " + getArea() + "\n";
    }


}
