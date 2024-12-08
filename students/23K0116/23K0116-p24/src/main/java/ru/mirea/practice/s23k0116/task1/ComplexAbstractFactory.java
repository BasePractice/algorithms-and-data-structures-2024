package ru.mirea.practice.s23k0116.task1;

public interface ComplexAbstractFactory {
    Complex createComplex(); // Создать комплексное число с нулевыми значениями

    Complex createComplex(int real, int image); // Создать комплексное число с заданными значениями
}
