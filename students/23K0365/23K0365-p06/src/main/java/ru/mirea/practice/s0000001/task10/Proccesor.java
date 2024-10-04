package ru.mirea.practice.s0000001.task10;

public class Proccesor {
    private int hz;
    //    private String socket;


    public Proccesor(int hz) {
        this.hz = hz;
    }

    public int getHz() {
        return hz;
    }

    //    public String getSocket() {
    //        return socket;
    //    }

    public void setHz(int hz) {
        this.hz = hz;
    }

    @Override
    public String toString() {
        return "hz=" + hz;
        //            + "\tsocket='" + socket;
    }
}