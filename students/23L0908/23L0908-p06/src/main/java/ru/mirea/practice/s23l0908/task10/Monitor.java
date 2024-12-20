package ru.mirea.practice.s23l0908.task10;

public class Monitor {
    private final int hertz;
    private final int size;
    private final String panel;

    public Monitor(int hertz, int size, String panel) {
        this.hertz = hertz;
        this.size = size;
        this.panel = panel;
    }

    public int getHertz() {
        return hertz;
    }

    @SuppressWarnings("unused")
    public int getSize() {
        return size;
    }

    @SuppressWarnings("unused")
    public String getPanel() {
        return panel;
    }

    @Override
    public String toString() {
        return "Monitor{"
            +
            "hertz="
            + hertz
            +
            ", size="
            + size
            +
            ", panel='"
            + panel
            + '\''
            +
            '}';
    }
}
