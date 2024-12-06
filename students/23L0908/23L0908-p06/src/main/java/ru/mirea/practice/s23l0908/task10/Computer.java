package ru.mirea.practice.s23l0908.task10;

public class Computer {
    private final String name;
    private final Memory memory;
    private final Monitor monitor;
    private final Processor processor;

    public Computer(String name, int ram, int rom, int hz, int size, String panel, double clockSpeed, int core, int threads) {
        this.name = name;
        memory = new Memory(ram, rom);
        monitor = new Monitor(hz, size, panel);
        processor = new Processor(clockSpeed, core, threads);
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Computer{"
            +
            "name='"
            + name
            + '\''
            +
            ", memory="
            + memory
            +
            ", monitor="
            + monitor
            +
            ", processor="
            + processor
            +
            '}';
    }
}
