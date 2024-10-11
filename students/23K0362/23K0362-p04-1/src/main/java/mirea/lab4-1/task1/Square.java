package mirea.lab9.task1;

public class Square extends Shape {
    private double lenFace;

    public Square(String name, double lenFace) {
        super(name);
        this.lenFace = Math.abs(lenFace) > 0 ? Math.abs(lenFace) : 1;
    }

    public double getLenFace() {
        return lenFace;
    }

    public void setLenFace(double lenFace) {
        if (lenFace <= 0) {
            lenFace = getPositive("lenFace");
        }
        this.lenFace = lenFace;
    }

    public double getArea() {
        return lenFace * lenFace;
    }

    public double getPerimeter() {
        return lenFace * 4;
    }

    @Override
    public String toString() {
        return "Square{" + "lenFace=" + lenFace + ", Area=" + getArea() + ", Perimeter=" + getPerimeter() + '}';
    }
}
