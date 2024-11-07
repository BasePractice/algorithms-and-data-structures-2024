package ru.mirea.practice.s23k0164.t2;

public final class Four {
    private Four() {

    }

    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        double base = 2.0;
        double degree = 3.0;
        double resultPower = mathFunc.power(base, degree);
        System.out.println(base + " в степени " + degree + " = " + resultPower);
        double realPart = 3.0;
        double imaginaryPart = 4.0;
        double resultModulus = mathFunc.modulus(realPart, imaginaryPart);
        System.out.println("Модуль комплексного числа (" + realPart + " + " + imaginaryPart + "i) = " + resultModulus);
        double radius = 5.0;
        double resultCircumference = mathFunc.circumference(radius);
        System.out.println("Длина окружности с радиусом " + radius + " = " + resultCircumference);
    }
}
