package mirea.lab7.p4;

import java.util.Scanner;

public abstract class Prac4p4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double pi = MathCalculable.pi;
            MathCalculable a = new MathFunc();
            System.out.println("Введите радиус: ");
            double rad = sc.nextDouble();
            System.out.println("Длина окружности: " + 2 * pi * rad);
            System.out.println("Площадь окружности: " + pi * a.power(rad, 2));
        }
    }
}
