package mirea.lab9.task1;

abstract class Tester {
    public static void main(String[] args) {
        final Shape circle1 = new Circle("c1", 25.8);
        final Shape square1 = new Square("s1", 233.4);
        final Shape rectangle1 = new Rectangle("r1", 23, 9.8);

        System.out.println("Круг: \nРадиус: " + circle1.getRadius());
        System.out.println("Имя: " + circle1.getName());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        circle1.setRadius(242.32);
        System.out.println(circle1.toString());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        System.out.println("Квадрат: \nДлина стороны: " + square1.getLenFace());
        System.out.println("Имя: " + square1.getName());
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());
        square1.setLenFace(-123);
        System.out.println(square1.toString());
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());

        System.out.println("Прямоугольник \nДлина сторон: lenA = " + rectangle1.getLenA() + ", lenB = " + rectangle1.getLenB());
        System.out.println("Имя: " + rectangle1.getName());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        rectangle1.setLenA(324);
        rectangle1.setLenB(34);
        System.out.println(rectangle1.toString());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }
}
