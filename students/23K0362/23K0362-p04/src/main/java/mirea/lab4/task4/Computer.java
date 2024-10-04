package mirea.lab9.task4;

public class Computer {
    private String namePC;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(String namePC, Processor processor, Memory memory, Monitor monitor) {
        this.namePC = namePC;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public String getNamePC() {
        return namePC;
    }

    public void setNamePC(String namePC) {
        this.namePC = namePC;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" + "namePC='" + namePC + '\'' + ", processor=" + processor
                + ", memory=" + memory + ", monitor=" + monitor + '}';
    }
}
