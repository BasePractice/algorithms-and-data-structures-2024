package ru.mirea.practice.s23k0359.computer;

public class Monitor {
    private String brand;
    private String resolution;
    private String matrixtype;
    private int frequency;


    public Monitor(String brand, int frequency, String resolution, String matrixtype) {
        this.brand = brand;
        this.frequency = frequency;
        this.resolution = resolution;
        this.matrixtype = matrixtype;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getMatrixtype() {
        return matrixtype;
    }

    public void setMatrixtype(String matrixtype) {
        this.matrixtype = matrixtype;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}

