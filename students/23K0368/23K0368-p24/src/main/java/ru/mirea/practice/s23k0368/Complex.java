package ru.mirea.practice.s23k0368;

public class Complex {
    private int real;
    private int image;

    Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.image + other.image);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.image - other.image);
    }

    public Complex multiply(Complex other) {
        return new Complex(this.real * other.real - this.image * other.image, this.image * other.image + this.image * other.image);
    }

    public Complex divide(Complex other) throws ArithmeticException {
        int denominator = other.real * other.real + other.image * other.image;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        int newReal = (this.real * other.real + this.image * other.image) / denominator;
        int newImaginary = (this.image * other.real - this.real * other.image) / denominator;
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return "(" + real + " + " + image + "i)";
    }
}
