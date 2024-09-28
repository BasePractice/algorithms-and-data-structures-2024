package ru.mirea.practice.s0000001.pw41.task1;

public class TestShapes {
    public static void main(String[] args) {
        Circle a = new Circle("circle",24.64,0.4,12.55);
        Rectangle b = new Rectangle("rectangle",75.214,5321.6,32.6,0.23);
        Square c = new Square("square",21.5,125.3,5,32);
        System.out.println(a.getName()+"\t"+a.getPerimetr()+"\t"+a.getArea()+"\t"+a.toString());
        System.out.println(b.getName()+"\t"+b.getPerimetr()+"\t"+b.getArea());
        System.out.println(c.getName()+"\t"+c.getPerimetr()+"\t"+c.getArea());
    }
}
