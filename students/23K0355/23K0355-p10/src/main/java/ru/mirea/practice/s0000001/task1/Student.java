package ru.mirea.practice.s0000001.task1;

public class Student {
    private String fn;
    private String ln;
    private String mj;
    private int yr;
    private String gp;

    public Student(String fn, String ln, String mj, int yr, String gp) {
        this.fn = fn;
        this.ln = ln;
        this.mj = mj;
        this.yr = yr;
        this.gp = gp;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getMj() {
        return mj;
    }

    public void setMj(String mj) {
        this.mj = mj;
    }

    public int getYr() {
        return yr;
    }

    public void setYr(int yr) {
        this.yr = yr;
    }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }
}