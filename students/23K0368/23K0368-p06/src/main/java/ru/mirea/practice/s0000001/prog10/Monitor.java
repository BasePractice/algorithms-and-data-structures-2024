package ru.mirea.practice.s0000001.prog10;

import java.util.Objects;

public class Monitor {
    private String monitopreName;
    private String monitoreSize;

    public Monitor(String monitopreName, String monitoreSize) {
        this.monitopreName = monitopreName;
        this.monitoreSize = monitoreSize;
    }

    public String getMonitopreName() {
        return monitopreName;
    }

    public void setMonitopreName(String monitopreName) {
        this.monitopreName = monitopreName;
    }

    public String getMonitoreSize() {
        return monitoreSize;
    }

    public void setMonitoreSize(String monitoreSize) {
        this.monitoreSize = monitoreSize;
    }

    @Override
    public String toString() {
        return "Monitor{"
                + "premonitoryName='" + monitopreName + '\''
                + ", monitoreSize='" + monitoreSize + '\''
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
        Monitor other = (Monitor) obj;
        return monitoreSize.equals(other.monitoreSize)
                && monitopreName.equals(other.monitopreName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monitopreName, monitoreSize);
    }
}
