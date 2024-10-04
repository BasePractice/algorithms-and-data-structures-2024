package ru.mirea.practice.s23k0350.task1;

public class MovableRect extends MovablePoint7 {
    MovablePoint7 upleft;
    MovablePoint7 downright;

    public MovableRect(MovablePoint7 downright) {
        super(downright.x, downright.y, downright.speed);
        this.downright = downright;
    }

    public MovableRect(MovablePoint7 upleft, MovablePoint7 downright) {
        super(upleft.x, upleft.y, upleft.speed);
        this.downright = downright;
        this.upleft = upleft;
    }

    public int getXD() {
        return downright.getX();
    }

    public int getYD() {
        return downright.getY();
    }

    public int getXU() {
        return upleft.getX();
    }

    public int getYU() {
        return upleft.getX();
    }

    public void moveUp() {
        upleft.y += speed;
        downright.y += speed;
    }

    public void moveDown() {
        upleft.y -= speed;
        downright.y -= speed;
    }

    public void moveLeft() {
        upleft.x -= speed;
        downright.x -= speed;
    }

    public void moveRight() {
        upleft.x += speed;
        downright.x += speed;
    }

    public String toString() {
        return "Ваша фигура: прямоугольник, построенный на точках "
                + getXD()
                + " "
                + getYD()
                + ";"
                + getXU()
                + " "
                + getYU()
                + " со скоростью "
                + getSpeed();

    }
}
