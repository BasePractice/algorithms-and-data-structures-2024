package ru.mirea.practice.s23l0908.task10;

public class Processor {
    private final double clockSpeed;
    private final int core;
    private final int threads;

    public Processor(double clockSpeed, int core, int threads) {
        this.clockSpeed = clockSpeed;
        this.core = core;
        this.threads = threads;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    @SuppressWarnings("unused")
    public int getCore() {
        return core;
    }

    @SuppressWarnings("unused")
    public int getThreads() {
        return threads;
    }

    @Override
    public String toString() {
        return "Processor{"
            +
            "clockSpeed="
            + clockSpeed
            +
            ", core="
            + core
            +
            ", threads="
            + threads
            +
            '}';
    }
}
