package mirea.lab9.task8;

abstract class Tester {
    public static void main(String[] args) {
        final Circle circle1 = new Circle("c1", "Green", true,25.8);
        final Square square1 = new Square("s1", "Blue", false, 233.4);
        final Rectangle rectangle1 = new Rectangle("r1", "Yellow", true, 23, 9.8);

        System.out.println("Круг: \nРадиус: " + circle1.getRadius());
        System.out.println("Имя: "  + circle1.getName());
        System.out.println("Площадь: " + circle1.getArea());
        System.out.println("Периметр: " + circle1.getPerimeter());
        circle1.setRadius(242.32);
        circle1.setColor("Blue");
        circle1.setFilled(false);
        System.out.println(circle1.toString());

        System.out.println("Квадрат: \nДлина стороны: " + square1.getSide());
        System.out.println("Имя: " + square1.getName());
        System.out.println("Площадь: " + square1.getArea());
        System.out.println("Периметр: " + square1.getPerimeter());
        square1.setSide(123);
        square1.setColor("Black");
        square1.setFilled(false);
        System.out.println(square1.toString());

        System.out.println("Прямоугольник \nДлина сторон: wight = " + rectangle1.getWight() + ", length = " + rectangle1.getLength());
        System.out.println("Имя: " + rectangle1.getName());
        System.out.println("Площадь: " + rectangle1.getArea());
        System.out.println("Периметр: " + rectangle1.getPerimeter());
        rectangle1.setWight(324);
        rectangle1.setLength(34);
        square1.setColor("Pink");
        square1.setFilled(false);
        System.out.println(rectangle1.toString());
    }
}
