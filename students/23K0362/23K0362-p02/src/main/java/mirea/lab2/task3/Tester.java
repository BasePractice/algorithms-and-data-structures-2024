package mirea.lab9.task3;

import java.util.Scanner;

abstract class Tester {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int lenArr = 5;
            Circle[] arrayCircle = new Circle[lenArr];

            double dopX;
            double dopY;
            double dopRad;
            for (int i = 0; i < lenArr; i++) {
                System.out.println("Inter X:");
                dopX = sc.nextDouble();
                System.out.println("Inter Y:");
                dopY = sc.nextDouble();
                System.out.println("Inter Rad:");
                dopRad = Math.abs(sc.nextDouble());
                arrayCircle[i] = new Circle(dopX, dopY, dopRad);
            }

            System.out.println("Made Circles:");
            for (int i = 0; i < lenArr; i++) {
                System.out.println((i + 1) + ") " + arrayCircle[i].toString());
            }
        }
    }
}
