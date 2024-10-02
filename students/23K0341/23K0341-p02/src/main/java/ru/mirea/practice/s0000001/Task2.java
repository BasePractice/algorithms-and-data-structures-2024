package ru.mirea.practice.s0000001;

/********************************************************************************
 * По UML диаграмме класса, представленной на рис. 2.5 написать                 *
 * программу, которая состоит из двух классов. Один из них Ball должен          *
 * реализовывать сущность мяч, а другой с названием TestBall тестировать работу *
 * созданного класса. Класс Ball должен содержать реализацию методов,           *
 * представленных на UML. Диаграмма на рисунке описывает сущность Мяч           *
 * написать программу. Класс Ball моделирует движущийся мяч.                    *
 ********************************************************************************/

public abstract class Task2 {
    public static void main(String[] args) {
        TestBall tester = new TestBall();

        tester.testCreation();
        System.out.println();

        tester.testCreation(69.0, 420.0);
        System.out.println();

        tester.testGetX(20.0, 10.0);
        System.out.println();

        tester.testGetX();
        System.out.println();

        tester.testGetY(12.0, 13.25);
        System.out.println();

        tester.testGetY();
        System.out.println();

        tester.testSetX(20.0, 10.0, 99.99);
        System.out.println();

        tester.testSetX(19.0);
        System.out.println();

        tester.testSetY(22.8, 13.37, 999.999);
        System.out.println();

        tester.testSetY(39.0);
        System.out.println();

        tester.testSetXY(1.0, 2.0, 3.0, 4.0);
        System.out.println();

        tester.testSetXY(3.0, 9.0);
        System.out.println();

        tester.testMove(3.0, 9.0, 10.0, -30.0);
    }

    static class Ball {
        private double x;
        private double y;

        public Ball(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Ball() {
            this.x = 0.0;
            this.y = 0.0;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setXY(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void move(double dx, double dy) {
            this.x += dx;
            this.y += dy;
        }

        @Override
        public String toString() {
            return "Ball { x=" + x + ", y=" + y + " }";
        }
    }

    static class TestBall {
        void testCreation(double x, double y) {
            Ball ball = new Ball(x, y);

            System.out.println("Был найден мячик: " + ball);
        }

        void testCreation() {
            Ball ball = new Ball();

            System.out.println("Был создан мячик: " + ball);
        }

        void testGetX(double x, double y) {
            Ball ball = new Ball(x, y);

            System.out.println("Был найден мячик: " + ball);
            System.out.println("Его позиция по X: " + ball.getX());
        }

        void testGetX() {
            testGetX(0.0, 0.0);
        }

        void testGetY(double x, double y) {
            Ball ball = new Ball(x, y);

            System.out.println("Был найден мячик: " + ball);
            System.out.println("Его позиция по Y: " + ball.getY());
        }

        void testGetY() {
            testGetY(0.0, 0.0);
        }

        void testSetX(double x, double y, double newX) {
            Ball ball = new Ball(x, y);

            System.out.println("Был найден мячик: " + ball);
            System.out.println("Его позиция по X: " + ball.getX());
            ball.setX(newX);
            System.out.println("Его новая позиция по X: " + ball.getX());
        }

        void testSetX(double newX) {
            testSetX(0.0, 0.0, newX);
        }

        void testSetY(double x, double y, double newY) {
            Ball ball = new Ball(x, y);

            System.out.println("Был найден мячик: " + ball);
            System.out.println("Его позиция по Y: " + ball.getY());
            ball.setY(newY);
            System.out.println("Его новая позиция по Y: " + ball.getY());
        }

        void testSetY(double newY) {
            testSetY(0.0, 0.0, newY);
        }

        void testSetXY(double x, double y, double newX, double newY) {
            Ball ball = new Ball(x, y);

            System.out.println("Был найден мячик: " + ball);
            System.out.println("Его позиция по X: " + ball.getX());
            System.out.println("Его позиция по Y: " + ball.getY());
            ball.setXY(newX, newY);
            System.out.println("Его новая позиция по X: " + ball.getX());
            System.out.println("Его новая позиция по Y: " + ball.getY());
        }

        void testSetXY(double newX, double newY) {
            testSetXY(0.0, 0.0, newX, newY);
        }

        void testMove(double x, double y, double moveX, double moveY) {
            Ball ball = new Ball(x, y);

            System.out.println("Был найден мячик: " + ball);
            System.out.println("Его позиция по X: " + ball.getX());
            System.out.println("Его позиция по Y: " + ball.getY());
            ball.move(moveX, moveY);
            System.out.println("Его новая позиция по X: " + ball.getX());
            System.out.println("Его новая позиция по Y: " + ball.getY());
        }
    }
}
