package ru.mirea.practice.s230k754.lab3.taskmathrand.task2;

public class Tester {
    private Circle[] arr;
    private int count;

    public Tester(int countTester) {
        this.arr = new Circle[count];
        this.count = countTester;
    }

    public void append(Circle cr) {
        this.arr[count] = cr;
    }

    public void bigCircle() {
        double maxRadius = arr[0].getRadius();
        for (int i = 0; i < count; i++) {
            if (arr[i].getRadius() >= maxRadius) {
                maxRadius = arr[i].getRadius();
            }
        }

        System.out.printf("Максимальнй радиус из списка: %f", maxRadius);
    }

    public void smallCircle() {
        double smRadius = arr[0].getRadius();
        for (int i = 0; i < count; i++) {
            if (arr[i].getRadius() <= smRadius) {
                smRadius = arr[i].getRadius();
            }
        }

        System.out.printf("Минимальный радиус из списка: %f", smRadius);
    }

    public void sort() {
        Circle temp;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (arr[i].getRadius() > arr[j + 1].getRadius()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
