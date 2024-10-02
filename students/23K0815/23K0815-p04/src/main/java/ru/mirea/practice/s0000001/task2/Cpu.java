package ru.mirea.practice.s0000001.task2;

class Cpu {
    private String cpuModel;
    private int cpuCores;
    private double cpuFrequency;

    public Cpu(String cpuModel, int cpuCores, double cpuFrequency) {
        this.cpuModel = cpuModel;
        this.cpuCores = cpuCores;
        this.cpuFrequency = cpuFrequency;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    @Override
    public String toString() {
        return "CPU{"
                + "cpuModel='" + cpuModel + '\''
                + ", cpuCores=" + cpuCores
                + ", cpuFrequency=" + cpuFrequency + " GHz "
                + '}';
    }
}