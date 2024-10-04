package ru.mirea.practice.s0000001.task3;

public class Circle {
    private double[] pos;
    private double[] rpos;

    public Circle(double[] pos,double[] rpos) {
        this.pos = pos;
        this.rpos = rpos;
    }

    public void setPos(double[] pos) {
        this.pos = pos;
    }

    public void setRpos(double[] rpos) {
        this.rpos = rpos;
    }

    public double getRadius(double[] pos,double[] rpos) {
        return Math.sqrt(Math.pow(pos[0] - rpos[0],2) + Math.pow(pos[1] - rpos[1],2));
    }

    public double getCirclen(double r) {
        return 2 * Math.PI * r;
    }

    public double[] getPoints(double r,double circlen,double sizeofpoint,double[] pos) {
        int len = (int)Math.floor(circlen);
        double[] points = new double[(len + 1) * 2];
        int cnt = 0;
        for (double i = 0;i < r;i += sizeofpoint) {
            for (double j = 0;j < r;j += sizeofpoint) {
                if (Math.pow(i,2) + Math.pow(j,2) == Math.pow(r,2)) {
                    points[cnt] = i + pos[0];
                    points[cnt + 1] = j + pos[1];
                    cnt += 1;
                }
            }
        }
        return points;
    }

    @Override
    public String toString() {
        return "Circle{pos=" + pos + ",rpos=" + rpos + "}";
    }
}
