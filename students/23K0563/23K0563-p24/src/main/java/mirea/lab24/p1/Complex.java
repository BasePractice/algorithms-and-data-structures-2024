package mirea.lab24.p1;

public class Complex {
    private int real;
    private int image;

    public Complex() {
        this.real = 0;
        this.image = 0;
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getComplex() {
        if (image != 0) {
            if (image > 0) {
                return real + "+" + image + "i";
            } else {
                return real + Integer.toString(image) + "i";
            }
        } else {
            return Integer.toString(real);
        }
    }
}
