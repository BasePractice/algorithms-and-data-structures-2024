package ru.mirea.practice.s23l0908.task1;

public final class Main {

    // Private constructor to prevent instantiation
    private Main() {
    }

    @SuppressWarnings("unused")
    public interface ComplexAbstractFactory {
        Complex createComplex();

        Complex createComplex(int real, int image);

    }

    // Class representing a complex number
    public static class Complex {
        private final int real;
        private final int image;

        public Complex(int real, int image) {
            this.real = real;
            this.image = image;
        }

        @Override
        public String toString() {
            return "Complex{"
                +
                "real="
                + real
                + ", image="
                + image
                +
                '}';
        }
    }


    // Concrete factory for creating Complex objects
    public static class ConcreteFactory implements ComplexAbstractFactory {

        private static final int DEFAULT_REAL = 12;
        private static final int DEFAULT_IMAGE = 23;

        @Override
        public Complex createComplex() {
            return new Complex(DEFAULT_REAL, DEFAULT_IMAGE);
        }

        @Override
        public Complex createComplex(int real, int image) {
            return new Complex(real, image);
        }
    }

    // Entry point
    public static void main(String[] args) {
        ConcreteFactory concreteFactory = new ConcreteFactory();

        // Create Complex objects using the factory
        Complex complex1 = concreteFactory.createComplex();
        Complex complex2 = concreteFactory.createComplex(20, 67);

        // Print the created objects
        System.out.println("Complex_1: " + complex1);
        System.out.println("Complex_2: " + complex2);
    }
}

