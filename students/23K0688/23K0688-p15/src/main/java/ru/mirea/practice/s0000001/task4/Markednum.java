package ru.mirea.practice.s0000001.task4;

public class Markednum {

    private double num;
    private boolean mark;

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public boolean getMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    Markednum(double num, boolean mark) {
        this.num = num;
        this.mark = mark;
    }

    public void arrout(Markednum[] mark) {
        for (Markednum markednum : mark) {
            System.out.println(markednum);
        }
    }

    public double nonmarked(Markednum[] mark) {
        double res = 9.11;
        for (Markednum markednum : mark) {
            if (!markednum.getMark()) {
                res = markednum.getNum();
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "markednum:" + num + "," + mark;
    }
}
