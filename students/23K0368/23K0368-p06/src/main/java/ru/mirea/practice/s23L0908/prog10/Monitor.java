package ru.mirea.practice.s23L0908.prog10;

import java.util.Objects;

public class Monitor {
    private final String monitopreName;
    private final String monitoreSize;

    public Monitor(String monitopreName, String monitoreSize) {
        this.monitopreName = monitopreName;
        this.monitoreSize = monitoreSize;
    }

    public String getMonitopreName() {
        return monitopreName;
    }

    public String getMonitoreSize() {
        return monitoreSize;
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
