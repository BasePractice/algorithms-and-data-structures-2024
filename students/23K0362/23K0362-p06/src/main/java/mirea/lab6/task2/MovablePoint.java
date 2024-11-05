package mirea.lab9.task2;

class MovablePoint implements Movable {
    int x;
    int y;
    int xxSpeed;
    int yySpeed;

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

    public void changeXSpeed(int xxNewSpeed) {
        this.xxSpeed = xxNewSpeed;
    }

    public void changeYSpeed(int yyNewSpeed) {
        this.yySpeed = yyNewSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + x + ", " + y + "}";
    }
}