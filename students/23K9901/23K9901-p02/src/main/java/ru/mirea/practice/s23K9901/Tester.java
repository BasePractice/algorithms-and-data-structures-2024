public class Tester {
    private Circle[] circles;
    private int numberOfCircles;

    public Tester(int size) {
        circles = new Circle[size];
        numberOfCircles = 0;
    }

    public void addCircle(Circle circle) {
        if (numberOfCircles < circles.length) {
            circles[numberOfCircles] = circle;
            numberOfCircles++;
        } else {
            System.out.println("Массив окружностей заполнен.");
        }
    }

    public int getNumberOfCircles() {
        return numberOfCircles;
    }

    public void printCircles() {
        for (int i = 0; i < numberOfCircles; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(3);

        tester.addCircle(new Circle(new Point(0, 0), 5));
        tester.addCircle(new Circle(new Point(1, 1), 10));
        tester.addCircle(new Circle(new Point(2, 2), 7));

        tester.printCircles();

        System.out.println("Количество окружностей в массиве: " + tester.getNumberOfCircles());
    }
}

