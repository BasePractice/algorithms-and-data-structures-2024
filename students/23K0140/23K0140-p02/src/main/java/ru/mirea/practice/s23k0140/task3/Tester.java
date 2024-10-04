package ru.mirea.practice.s23k0140.task3;

class Tester {
    private final Circle[] circles;
    private int count;

    public Tester(int size) {
        this.circles = new Circle[size];
        this.count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив заполнен. Невозможно добавить еще одну окружность.");
        }
    }

    public void printCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
        Point center1 = new Point(0, 0);
        Circle circle1 = new Circle(center1, 5);

        Point center2 = new Point(1, 1);
        Circle circle2 = new Circle(center2, 3);

        Tester tester = new Tester(5);
        tester.addCircle(circle1);
        tester.addCircle(circle2);

        tester.printCircles();
    }
}