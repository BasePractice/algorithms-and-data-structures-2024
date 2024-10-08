package ru.mirea.practice.s23K0135.pw4.task4;

public class Monitor {
    private int size;
    private int hz;
    private String matrix;
    private String picture;

    public Monitor(int size, int hz, String matrix, String picture) {
        this.size = size;
        this.hz = hz;
        this.matrix = matrix;
        this.picture = picture;
    }

    public int getSize() {
        return size;
    }

    public int getHz() {
        return hz;
    }

    public String getMatrix() {
        return matrix;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "size=" + size
                + "\thz=" + hz
                + "\tmatrix='" + matrix
                + "\tpicture='" + picture;
    }
}
