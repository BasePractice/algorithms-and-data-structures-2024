package ru.mirea.practice.s0000001.task3;

public abstract class Tester {
    public static void main(String[] args) {
        double[] pos = {0.0,0.0};
        double[] rpos = {1.0,1.0};
        double sizeofpoint = 0.5;
        Circle[] circles = new Circle[1];
        circles[0] = new Circle(pos,rpos);
        double radius = circles[0].getRadius(pos,rpos);
        double len = circles[0].getCirclen(radius);
        double[] pointnum = circles[0].getPoints(radius,len,sizeofpoint,pos);
        System.out.println("длина окружности =" + len);
        System.out.println("радиус =" + radius);
        System.out.println("количество точек =" + (pointnum.length));
        Point p1 = new Point(pos[0],pos[1]);
        System.out.println("координаты центра по x - " + (p1.getX()));
        System.out.println("координаты центра по y - " + (p1.getY()));
    }
}
