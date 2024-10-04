package ru.mirea.practice.s0000001.task3;

interface MathCalculable {
    double PI = 3.14159;

    double power(double base, double exponent);
    double modulus(double real, double imaginary);
}

class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double modulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
}

class MathTest {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        System.out.println("PI: " + MathCalculable.PI);
        System.out.println("Power: " + mc1.power(2, 3));
        System.out.println("Modulus: " + mc1.modulus(3, 4));
    }
}
