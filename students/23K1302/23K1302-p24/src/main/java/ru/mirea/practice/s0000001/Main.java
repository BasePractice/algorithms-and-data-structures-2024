package ru.mirea.practice.s0000001;

public final class Main {

    private Main() {
        // f;djvnfjklsdnv;jskdfn
    }

    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex defaultComplex = factory.createComplex();
        System.out.println("комплексное число без параметров: " + defaultComplex);

        Complex paramComplex = factory.createComplex(2, 3);
        System.out.println("комплексное число с заданными параметрами: " + paramComplex);
    }
}
