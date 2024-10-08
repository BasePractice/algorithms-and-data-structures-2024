package ru.mirea.practice.s23K0135.practice41.shape;

public abstract class Mistakes {
    public static void main(String[] args) {
        Circle s1 = new Circle(5.5, "RED", false); // Upcast Circle
        System.out.println(s1);//which version?
        System.out.println(s1.getArea());// which version?
        System.out.println(s1.getPerimeter());//which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius());

        Circle c1 = (Circle) s1;// Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape - абстрактный метод, нельзя создать его экземпляр
        //Shape s2 = new Shape();

        Rectangle s3 = new Rectangle(1.0, 2.0, "RED", false);// Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength());
        //downcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength());

        Square s4 = new Square(6.6);//Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());

        /*обратите внимание, что выполняем downcast Shape s4 к
        Rectangle, который является суперклассом
        Square(родителем), вместо Square */

        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());
        System.out.println(s4.getLength());

        // Downcast Rectangle r2 к Square

        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());
        System.out.println(s4.getLength());
    }
}
