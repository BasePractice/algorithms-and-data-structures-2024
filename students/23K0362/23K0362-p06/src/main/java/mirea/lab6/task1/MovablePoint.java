package mirea.lab9.task1;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xxSpeed;
    private int yySpeed;

    public MovablePoint(int x, int y, int xxSpeed, int yySpeed) {
        this.x = x;
        this.y = y;
        this.xxSpeed = xxSpeed;
        this.yySpeed = yySpeed;
    }

    @Override
    public void moveUp() {
        y += yySpeed;
    }

    @Override
    public void moveDown() {
        y -= yySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xxSpeed;
    }

    @Override
    public void moveRight() {
        x += xxSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xxSpeed + ", ySpeed=" + yySpeed + '}';
    }
}