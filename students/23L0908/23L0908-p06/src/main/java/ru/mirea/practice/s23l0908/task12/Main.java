package ru.mirea.practice.s23l0908.task12;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        IMovable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        IMovable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveDown();
        System.out.println(m2);

        IMovable m3 = new MovableRectangle(2, 3, 1, 5, 4, 9);
        System.out.println(m3);
        m3.moveUp();
        System.out.println(m3);
        m3.moveRight();
        System.out.println(m3);
    }

    interface IMovable {
        void moveUp();

        void moveDown();

        void moveLeft();

        void moveRight();
    }

    public static class MovablePoint implements IMovable {
        protected int x;
        protected int y;
        protected int xspeed;
        protected int yspeed;

        public MovablePoint(int x, int y, int xspeed, int yspeed) {
            this.x = x;
            this.y = y;
            this.xspeed = xspeed;
            this.yspeed = yspeed;
        }

        @Override
        public String toString() {
            return "MovablePoint{"
                +
                "x="
                + x
                +
                ", y="
                + y
                +
                ", xSpeed="
                + xspeed
                +
                ", ySpeed="
                + yspeed
                +
                '}';
        }

        @Override
        public void moveUp() {
            System.out.println("Move Up!");
            y += yspeed;
        }

        @Override
        public void moveDown() {
            System.out.println("Move Down!");
            y -= yspeed;
        }

        @Override
        public void moveLeft() {
            System.out.println("Move Left!");
            x -= xspeed;
        }

        @Override
        public void moveRight() {
            System.out.println("Move Right!");
            x += xspeed;
        }
    }

    public static class MovableCircle implements IMovable {
        MovablePoint center;
        private final int radius;

        public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
            center = new MovablePoint(x, y, xspeed, yspeed);
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "MovableCircle{"
                + "radius="
                + radius
                + ", center="
                + center
                +
                '}';
        }

        @Override
        public void moveDown() {
            System.out.print("Circle move down!");
            center.y -= center.yspeed;
        }

        @Override
        public void moveLeft() {
            System.out.print("Circle move left!");
            center.x -= center.xspeed;
        }

        @Override
        public void moveUp() {
            System.out.print("Circle move up!");
            center.y += center.yspeed;
        }

        @Override
        public void moveRight() {
            System.out.print("Circle move right!");
            center.x += center.xspeed;
        }
    }

    public static class MovableRectangle implements IMovable {
        private final MovablePoint topLeft;
        private final MovablePoint bottomRight;

        public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
            topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
            bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
        }

        @Override
        public String toString() {
            return "MovableRectangle{"
                +
                "topLeft="
                + topLeft
                +
                ", bottomRight="
                + bottomRight
                +
                '}';
        }

        @Override
        public void moveDown() {
            System.out.println("Rectangle move down!");
            topLeft.y -= topLeft.yspeed;
            bottomRight.y -= bottomRight.yspeed;
        }

        @Override
        public void moveRight() {
            System.out.println("Rectangle move right!");
            topLeft.x += topLeft.xspeed;
            bottomRight.x += bottomRight.xspeed;
        }

        @Override
        public void moveUp() {
            System.out.println("Rectangle move up!");
            topLeft.y += topLeft.yspeed;
            bottomRight.y += bottomRight.yspeed;
        }

        @Override
        public void moveLeft() {
            System.out.println("Rectangle move left!");
            topLeft.x -= topLeft.xspeed;
            bottomRight.x -= bottomRight.xspeed;
        }

        @SuppressWarnings("unused")
        public boolean sameSpeed() {
            return topLeft.xspeed == bottomRight.xspeed && topLeft.yspeed == bottomRight.yspeed;
        }
    }

}
