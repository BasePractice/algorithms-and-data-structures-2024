package ru.mirea.practice.s0000002;

/********************************************************************************
 * Создать класс, описывающий модель окружности (Circle). В классе              *
 * должны быть описаны нужные свойства окружности и методы для получения и      *
 * изменения этих свойств. Добавить методы для расчета площади круга и длины    *
 * окружности, а также метод позволяющий сравнивать две окружности. При         *
 * помощи класса CircleTest, содержащего статический метод main(String[] args), *
 * протестировать работу класcа Circle.                                         *
 ********************************************************************************/

public abstract class Task6 { // Является классом CircleTest
    public static void main(String[] args) {
        Circle circle1 = new Circle(0.0, 70.0, 10);
        Circle circle2 = new Circle(-6.0, 3.0, 9);

        System.out.println("Центр круга 1 находится в: { x=" + circle1.getCx() + "; y=" + circle1.getCy() + " }");
        System.out.println("Центр круга 2 находится в: { x=" + circle2.getCx() + "; y=" + circle2.getCy() + " }");

        System.out.println();
        circle1.setCxCy(circle1.cy, circle1.cx);
        circle2.setCxCy(circle2.cy, circle2.cx);
        System.out.println("Центр круга 1 теперь находится в: { x=" + circle1.getCx() + "; y=" + circle1.getCy() + " }");
        System.out.println("Центр круга 2 теперь находится в: { x=" + circle2.getCx() + "; y=" + circle2.getCy() + " }");

        System.out.println();
        System.out.println("Круг 1 радиус: " + circle1.getRadius());
        System.out.println("Круг 2 радиус: " + circle2.getRadius());

        System.out.println();
        circle1.setRadius(circle1.radius * 2);
        circle2.setRadius(circle2.radius * 2);
        System.out.println("Круг 1 радиус: " + circle1.getRadius());
        System.out.println("Круг 2 радиус: " + circle2.getRadius());

        System.out.println();
        System.out.println("Круг 1 больше круга 2?: " + circle1.biggerThan(circle2));
        System.out.println("Круг 2 длинее круга 1?: " + circle2.longerThan(circle1));
    }

    static class Circle {
        double radius;
        double cx;
        double cy;

        public Circle(double cx, double cy, double radius) {
            this.radius = radius;
            this.cx = cx;
            this.cy = cy;
        }

        public double getCx() {
            return cx;
        }

        public double getCy() {
            return cy;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setCx(double cx) {
            this.cx = cx;
        }

        public void setCy(double cy) {
            this.cy = cy;
        }

        public void setCxCy(double cx, double cy) {
            this.setCx(cx);
            this.setCy(cy);
        }

        public double area() {
            return Math.PI * radius * radius;
        }

        public double length() {
            return 2 * Math.PI * radius;
        }

        public boolean biggerThan(Circle other) {
            return this.area() > other.area();
        }

        public boolean longerThan(Circle other) {
            return this.length() > other.length();
        }
    }
}
