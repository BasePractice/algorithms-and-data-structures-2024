package ru.mirea.practice.s23L0908;

/**
 * Разработайте интерфейс MathCalculable, который содержит
 * объявления математических функций: возведения в степень и модуль
 * комплексного числа, также содержит число PI. Напишите класс MathFunc,
 * который реализует, реализует этот интерфейс. Например, вычисления длины
 * окружности, для чего используйте число PI из интерфейса.
 * <br><br>
 * Замечание: <br>
 * MathCalculable mc1 = new MathFunc(); // правильно<br>
 * MathCalculable mс2 = new MathCalculable ();<br>
 * //ошибка - запрещено объявлять экземпляр интерфейса
 */

public class Task4 {
    interface MathCalculable {
        int raise(int x, int n);

        double complexModule(Complex n);

        double getCircumference(double r);
    }

    static class Complex {
        double real;
        double imaginary;

        Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }
    }

    static class MathFunc implements MathCalculable {
        @Override
        public int raise(int numba, int power) {
            int result = 1;
            for (int i = 0; i < power; i++) {
                result *= numba;
            }
            return result;
        }

        @Override
        public double complexModule(Complex number) {
            return Math.sqrt(number.real * number.real + number.imaginary + number.imaginary);
        }

        @Override
        public double getCircumference(double r) {
            return 2 * Math.PI * r;
        }
    }
}
