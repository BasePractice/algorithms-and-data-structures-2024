package ru.mirea.practice.s23K0135;

public abstract class TestCircle {
    public static void main(String[] args) {
        Circle[] circles = {new Circle(10, "Окружность №1"), new Circle(7,
                "Окружность №2"), new Circle(7, "Окружность №3"), new Circle(15, "Окружность №4")};

        for (Circle circle : circles) {
            String formatCF = String.format("%.3f", circle.getCircumference());
            String formatArea = String.format("%.3f", circle.getArea());
            System.out.println(circle.getName() + ": радиус равен: " + circle.getRadius()
                    + ". Площадь равна: " + formatArea + ". Длина окружности равна: " + formatCF);
        }

        System.out.println("\n" + circles[0].toEqual(circles[1]));
        System.out.println(circles[0].toEqual(circles[3]));
        System.out.println(circles[1].toEqual(circles[2]));

    }

}
