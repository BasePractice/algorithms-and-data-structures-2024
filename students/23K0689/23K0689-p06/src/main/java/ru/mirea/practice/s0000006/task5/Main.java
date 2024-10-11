package ru.mirea.practice.s0000006.task5;

public final class Main {
    private Main() {
        // Приватный конструктор предотвращает создание экземпляров класса
    }

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Starting Point: " + point);
        point.moveUp();
        System.out.println("Moved Up   🔼 : " + point);
        point.moveRight();
        System.out.println("Moved Right  ➡ : " + point);

        System.out.println("\n--- Now Moving Circle ---\n");

        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println("Initial Circle: " + circle);
        circle.moveDown();
        System.out.println("Moved Down  🔽 : " + circle);
        circle.moveLeft();
        System.out.println("Moved Left  ⬅ : " + circle);

        System.out.println("\n🎯 Trajectory of the Circle Movement:");
        printCircleTrajectory(circle);
    }

    private static void printCircleTrajectory(MovableCircle circle) {
        System.out.println("⬅️ ⬅️ ⬅️ ⬅️ 🔵 Circle is now at " + circle);
        System.out.println("The radius remains: " + circle.getRadius() + " units");
    }
}
