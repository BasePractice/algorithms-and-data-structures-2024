package mirea.lab9.task2;

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xxSpeed, int yySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xxSpeed, yySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xxSpeed, yySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public boolean hasEqualSpeed() {
        return bottomRight.xxSpeed == topLeft.xxSpeed && bottomRight.yySpeed == topLeft.yySpeed;
    }

    public void toEqualSpeeds() {
        if (!hasEqualSpeed()) {
            bottomRight.changeXSpeed(topLeft.xxSpeed);
            bottomRight.changeYSpeed(topLeft.yySpeed);
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{topLeft: " + topLeft + ", bottomRight: " + bottomRight;
    }
}