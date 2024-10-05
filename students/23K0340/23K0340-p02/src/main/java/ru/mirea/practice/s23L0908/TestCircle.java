package ru.mirea.practice.s23L0908;

import java.util.Scanner;

public abstract class TestCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 3;
            double x = 0.0;
            double y = 0.0;
            int r = 0;
            Point point;
            Circle[] c = new Circle[n];
            for (int i = 0; i < n; i++) {
                x = sc.nextDouble();
                y = sc.nextDouble();
                r = sc.nextInt();
                point = new Point(x,y);
                c[i] = new Circle(point, r);
            }
            System.out.println(c[2].getLength());
            System.out.println(c[1].getCoord()[0] + " " + c[1].getCoord()[1]);
        }
    }
}
