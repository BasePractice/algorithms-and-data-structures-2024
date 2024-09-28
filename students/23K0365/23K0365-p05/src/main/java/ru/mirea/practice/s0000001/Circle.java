public class Circle extends Shape implements Shapes {
    private int radius;

    @Override
    public void getShape() {
        System.out.println("Circle, " + this);
    }

    public Circle(Color color, double x, double y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }
}
