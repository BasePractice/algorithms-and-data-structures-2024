package ru.mirea.practice.s23K0135;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        }
    }

    public void displayCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println("Circle " + (i + 1) + ": Center(" + circles[i].getCenter().getX()
                    + ", " + circles[i].getCenter().getY() + "), Radius: " + circles[i].getRadius());
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);
        tester.addCircle(new Circle(new Point(1, 2), 3));
        tester.addCircle(new Circle(new Point(4, 5), 2));
        tester.displayCircles();
    }
}
