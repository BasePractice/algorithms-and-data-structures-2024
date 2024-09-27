package ru.mirea.practice.s230k754.lab2.task3;

import java.util.Objects;

public class Tester {
    private Circle[] arr;
    private int count;

    public Tester(int count) {
        this.arr = new Circle[count];
        this.count = 0;
    }

    public void append(double r, double x, double y) {
        if (count == arr.length) {
            System.out.println("Массив заполнен");
            return;
        }
        this.arr[this.count] = new Circle(r, x, y);
        this.count += 1;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.count; i++) {
            str += "Circle " + Objects.toString(i + 1) + ": " + arr[i].toString() + "\n";
        }
        return str;
    }
}
