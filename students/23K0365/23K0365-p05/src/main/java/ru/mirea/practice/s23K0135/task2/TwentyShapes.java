package ru.mirea.practice.s23K0135.task2;

public abstract class TwentyShapes {
    public static void main(String[] args) {
        Shapes[] a = {
            new Rectangle(Color.randomOne(), (int) (Math.random() * 6),
                        (int) (Math.random() * 6), (int) (Math.random() * 6),
                        (int) (Math.random() * 6)),
            new Circle(Color.randomOne(),
                        (int) (Math.random() * 6), (int) (Math.random() * 6),
                        (int) (Math.random() * 6))};
        for (int i = 0; i < 20; i++) {
            a[(int) (Math.random() * 2)].getShape();
        }
    }
}
