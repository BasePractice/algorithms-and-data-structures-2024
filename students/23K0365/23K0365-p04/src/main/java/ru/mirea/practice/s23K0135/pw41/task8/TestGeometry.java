package ru.mirea.practice.s23K0135.pw41.task8;

public abstract class TestGeometry {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(12.4, 51.978);
        final Circle b = new Circle(999.99);
        Square c = new Square("Blue", true, 100.0001);
        c.setLength(12.1);
        System.out.println(c.getSide());
        System.out.println("area of rectang. is " + a.getArea());
        System.out.println("perimetr of circle is " + b.getPerimetr());
        System.out.println(c);
    }
}
