package ru.mirea.practice.s23L0908;

/***************************************************************************
 * Написать программу, которая с помощью метода класса, вычисляет          *
 * факториал числа (использовать управляющую конструкцию цикла), проверить *
 * работу метода.                                                          *
 ***************************************************************************/

public abstract class Task7 {
    static int factorial(int numba) {

        if (numba == 0) {
            return 1;
        } else if (numba < 0) {
            throw new ArithmeticException("Факториал отрицательных чисел считать не умею. Извините.");
        }

        int newNumba = 1;

        for (int i = 2; i <= numba; ++i) {
            newNumba *= i;
        }

        return newNumba;
    }

    public static void main(String[] args) {
        String template = "%d! = %d\n";

        for (int i = 0; i < 10; ++i) {
            System.out.format(template, i, factorial(i));
        }
    }
}
