package ru.mirea.practice.s0000001.task4;

public class Pc {
    private String gpu;
    private String cpu;
    private String ram;
    private String os;
    private String origin;

    public Pc(String gpu,String cpu,String ram,String os,String origin) {
        this.gpu = gpu;
        this.cpu = cpu;
        this.ram = ram;
        this.os = os;
        this.origin = origin;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Pc{gpu=" + gpu + ",cpu=" + cpu + ",ram=" + ram + ",os=" + os + ",origin=" + origin + "}";
    }
}
