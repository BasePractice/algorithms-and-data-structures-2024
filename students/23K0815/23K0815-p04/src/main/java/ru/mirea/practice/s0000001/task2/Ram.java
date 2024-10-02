package ru.mirea.practice.s0000001.task2;

class Ram {
    private String memoryType;
    private int memorySize;

    public Ram(String memoryType, int memorySize) {
        this.memoryType = memoryType;
        this.memorySize = memorySize;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    @Override
    public String toString() {
        return "Ram{"
                + "memoryType='" + memoryType + '\''
                + ", memorySize=" + memorySize + " GB "
                + '}';
    }
}