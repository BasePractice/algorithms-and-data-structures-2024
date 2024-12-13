package ru.mirea.practice.s0000001.task1;

public class ConcreteFactory implements ComplexAbstractFactory {
    //вместо CreateComplex - creatingComplex. Не допустимое названиe(
    @Override
    public Complex creatingComplex(int r, int i) {
        return new Complex(i,r);
    }

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    public static void main(String[] args) {
        ComplexAbstractFactory a = new ConcreteFactory();
        Complex temp = a.creatingComplex(3,0);
        Complex scTemp = a.createComplex();
        Complex thTemp = a.creatingComplex(5,-7);
        System.out.println(temp + "\n" + scTemp + "\n" + thTemp);
    }
}
