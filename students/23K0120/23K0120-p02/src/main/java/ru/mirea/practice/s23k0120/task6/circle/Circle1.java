package ru.mirea.practice.s23k0120.task6.circle;

import ru.mirea.practice.s23k0120.task3.circle.Point;

public class Circle1 extends ru.mirea.practice.s23k0120.task3.circle.Circle {

    public Circle1(Point center, double r) {
        super(center, r);
    }

    public double getArea() {
        return Math.PI * Math.pow(this.getR(), 2);
    }

    public double getCircumference() {
        return Math.PI * this.getR() * 2f;
    }

    public void setArea(double area) {
        this.setR(Math.sqrt(area / Math.PI));
    }

    public void setCircumference(double length) {
        this.setR(length / (2 * Math.PI));
    }

    @Override
    public String toString() {
        return String.format("Круг: Центр - %s Радиус - %.3f Длина окружности - %.3f Площадь - %.3f",
                this.getCenter().toString(), this.getR(), this.getCircumference(), this.getArea());
    }
}
