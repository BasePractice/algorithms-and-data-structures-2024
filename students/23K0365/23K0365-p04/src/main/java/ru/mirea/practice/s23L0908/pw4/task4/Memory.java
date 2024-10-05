package ru.mirea.practice.s23L0908.pw4.task4;

public class Memory {
    private int hz;
    private int size;
    private String info;

    public Memory(int hz, int size, String info) {
        this.hz = hz;
        this.size = size;
        this.info = info;
    }

    public int getHz() {
        return hz;
    }

    public int getSize() {
        return size;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "hz=" + hz
                + "\tsize=" + size
                + "\tinfo='" + info;
    }
}
