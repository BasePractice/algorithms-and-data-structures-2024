package ru.mirea.practice.s0000001.start.task1;

public abstract class Test {
    public static void main(String[] args) {
        Shape sh = new Shape("Liner");
        Circ1 cr = new Circ1("Circle",10.0);
        Rect1 rc = new Rect1("Rectangle",5,6);
        Squa1 sq = new Squa1("Square",5);
        System.out.println(sh);
        System.out.println(cr);
        System.out.println("perim=" + cr.getPerimetr());
        System.out.println("area=" + cr.getArea());
        System.out.println(rc);
        System.out.println("perim=" + rc.getPerimetr());
        System.out.println("area=" + rc.getArea());
        System.out.println(sq);
        System.out.println("perim=" + sq.getPerimetr());
        System.out.println("area=" + sq.getArea());
    }
}

