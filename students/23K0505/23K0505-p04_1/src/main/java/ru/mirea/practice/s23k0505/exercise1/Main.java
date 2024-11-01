package ru.mirea.practice.s23k0505.exercise1;

public abstract class Main {
    public static void main(String[] args) {
        Circle s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); //Child class version
        System.out.println(s1.getArea()); // Child class version
        System.out.println(s1.getPerimeter()); // Child class version
        System.out.println(s1.getColor()); // Child class version
        System.out.println(s1.isFilled()); // Child class version
        //System.out.println(s1.getRadius()); // Cannot resolve method "getRadius" in "Shape"
        // (Trying to access Parent class version, but it doesn't exist)
        // Can't access child version of a method when the object is upcasted, but the method isn't defined in the parent class

        Circle c1 = s1; // Downcast back to Circle
        System.out.println(c1); // Child class version
        System.out.println(c1.getArea()); // Child class version
        System.out.println(c1.getPerimeter()); // Child class version
        System.out.println(c1.getColor()); // Child class version
        System.out.println(c1.isFilled()); // Child class version
        System.out.println(c1.getRadius()); // Child class version
        Shape s2 = new Shape();
        System.out.println(s2);
        Rectangle s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3); // Child class version
        System.out.println(s3.getArea()); // Child class version
        System.out.println(s3.getPerimeter()); // Child class version
        System.out.println(s3.getColor()); // Child class version
        System.out.println(s3.getLength()); // Cannot resolve method "getLength" in "Shape" (Trying to access Parent class version)
        System.out.println("Rectangle r1 = (Rectangle)s3;");
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength());
        Square s4 = new Square(6.6);//Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); // Cannot resolve method "getSide" in "Shape" (Trying to access Parent class version)
        /*обратите внимание, что выполняем downcast Shape s4 к
        Rectangle, который является суперклассом
        Square(родителем), вместо Square */
        Square r2 = s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); // Cannot resolve method "getSide" in "Shape" (Trying to access Parent class version)
        System.out.println(r2.getLength());
        // Downcast Rectangle r2 к Square
        Square sq1 = r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide()); // Cannot resolve method "getSide" in "Shape" (Trying to access Parent class version)
        System.out.println(sq1.getLength());
    }
}
