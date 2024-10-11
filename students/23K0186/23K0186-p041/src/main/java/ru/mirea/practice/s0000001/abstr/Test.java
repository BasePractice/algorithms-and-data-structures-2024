package ru.mirea.practice.s0000001.abstr;

public abstract class Test {
    public static void main(String[] args) {
        Circ1 cr = new Circ1(10.0,"red",true);
        Rect1 rc = new Rect1("Red",true,6.0,5.0);
        Squa1 sq = new Squa1("red",true,5.0);
        System.out.println(cr);
        System.out.println("perim=" + cr.getPerimetr());
        System.out.println("area=" + cr.getArea());
        System.out.println(rc);
        System.out.println("perim=" + rc.getPerimetr());
        System.out.println("area=" + rc.getArea());
        System.out.println(sq);
        System.out.println("perim=" + sq.getPerimetr());
        System.out.println("area=" + sq.getArea());
        sq.setLength(7.0);
        System.out.println(sq);
        System.out.println("perim=" + sq.getPerimetr());
        System.out.println("area=" + sq.getArea());

    }
}

