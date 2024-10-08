package ru.mirea.practice.s23K0135.prog10;

import java.util.Objects;

public class Memory {
    private String memoryName;
    private int memorySize;

    public Memory(String memoryName, int memorySize) {
        this.memoryName = memoryName;
        this.memorySize = memorySize;
    }

    public String getMemoryName() {
        return memoryName;
    }

    public int getMemorySize() {
        return memorySize;
    }


    @Override
    public String toString() {
        return "Memory{"
                + "memoryName='" + memoryName + '\''
                + ", memorySize=" + memorySize
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Memory other = (Memory) obj;
        return memorySize == other.memorySize
                && memoryName.equals(other.memoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memoryName, memorySize);
    }
}
