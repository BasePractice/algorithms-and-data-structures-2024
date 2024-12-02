package ru.mirea.practice.s0000001;

/**
 * Разработать программную реализацию по UML диаграмме,
 * представленной на рис.24.1с использованием изучаемых паттернов.
 */

public abstract class Task1 {
    public static void main(String[] args) {
        Complex z = new ConcreteFactory().createComplex();
        System.out.println(z);
        z = new ConcreteFactory().createComplex(1, 2);
        System.out.println(z);
    }

    interface ComplexAbstractFactory {
        Complex createComplex();

        Complex createComplex(int real, int image);
    }

    static class ConcreteFactory implements ComplexAbstractFactory {
        @Override
        public Complex createComplex() {
            return new Complex();
        }

        @Override
        public Complex createComplex(int real, int image) {
            return new Complex(real, image);
        }
    }

    static class Complex {
        private final int re;
        private final int im;

        Complex() {
            this(0, 0);
        }

        Complex(int real, int image) {
            re = real;
            im = image;
        }

        @Override
        public String toString() {
            return re + " + i" + im;
        }
    }
}
