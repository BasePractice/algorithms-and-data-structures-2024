package ru.mirea.practice.s0000001.task1;

class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Processor processor, Memory memory, Monitor monitor) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Компьютер с процессором " + processor + ", памятью " + memory + " и монитором " + monitor;
    }
}
