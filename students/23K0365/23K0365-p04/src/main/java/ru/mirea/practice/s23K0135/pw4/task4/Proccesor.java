package ru.mirea.practice.s23K0135.pw4.task4;

public class Proccesor {
    private int hz;
    private String socket;

    public Proccesor(int hz, String socket) {
        this.hz = hz;
        this.socket = socket;
    }

    public int getHz() {
        return hz;
    }

    public String getSocket() {
        return socket;
    }

    public void setHz(int hz) {
        this.hz = hz;
    }

    @Override
    public String toString() {
        return "hz=" + hz
                + "\tsocket='" + socket;
    }
}
