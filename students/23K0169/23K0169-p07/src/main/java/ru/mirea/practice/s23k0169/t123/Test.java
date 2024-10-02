package ru.mirea.practice.s23k0169.t123;

public final class Test {

    private Test() {

    }

    public static void main(String[] args) {
        MovablePoint topLeftPoint = new MovablePoint(0, 0, 2, 3);
        MovablePoint bottomRightPoint = new MovablePoint(5, 10, 2, 3);

        MovableRectangle rectangle = new MovableRectangle(topLeftPoint, bottomRightPoint);
        System.out.println(rectangle);

        System.out.println("Имеют точки одинаковую скорость? - " + rectangle.speedTest());

        rectangle.moveUp();
        rectangle.moveRight();

        System.out.println(rectangle);
    }
}


