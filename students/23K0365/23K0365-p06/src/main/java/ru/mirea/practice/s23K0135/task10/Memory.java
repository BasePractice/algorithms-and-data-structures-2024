package ru.mirea.practice.s23K0135.task10;

public class Memory {
    private int hz;
    private int size;
    //private String info;


    public Memory(int hz, int size) {
        this.hz = hz;
        this.size = size;
    }

    public int getHz() {
        return hz;
    }

    public int getSize() {
        return size;
    }

    //    public String getInfo() {
    //        return info;
    //    }

    //    public void setInfo(String info) {
    //        this.info = info;
    //    }

    @Override
    public String toString() {
        return "hz=" + hz
                + "\tsize=" + size;
        //            + "\tinfo='" + info;
    }
}
