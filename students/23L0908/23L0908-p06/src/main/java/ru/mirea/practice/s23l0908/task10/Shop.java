package ru.mirea.practice.s23l0908.task10;

public class Shop {
    private final Computer[] computers;
    private int top;
    private final int capacity;

    public Shop(int size) {
        this.capacity = size;
        top = -1;
        computers = new Computer[size];
    }

    public boolean isFull() {
        return this.top == capacity - 1;
    }

    @SuppressWarnings("unused")
    public boolean isEmpty() {
        return this.top == -1;
    }

    public void addComputer(String name, int ram, int rom, int hz, int size, String panel, double clockSpeed, int core, int threads) {
        if (!isFull()) {
            computers[++top] = new Computer(name, ram, rom, hz, size, panel, clockSpeed, core, threads);
        } else {
            System.out.println("Cannot add computer: storage is full.");
        }
    }

    public void delComputer(String name) {
        for (int i = 0; i <= top; i++) {
            if (computers[i].getName().equals(name)) {
                top--;
                for (int j = i; j <= top; j++) {
                    computers[j] = computers[j + 1];
                }
            }
        }
    }

    @SuppressWarnings("unused")
    public Computer searchComputer(String name, int ram, int rom, int hz, int size, String panel, double clockSpeed, int core, int threads) {
        Computer temp = new Computer(name, ram, rom, hz, size, panel, clockSpeed, core, threads);
        for (int i = 0; i <= top; i++) {
            if (computers[i] == temp) {
                return computers[i];
            }
        }
        return null;
    }

    public Computer searchComputer(int ram, int hz, double clockSpeed) {
        for (int i = 0; i <= top; i++) {
            if (computers[i].getMemory().getRam() == ram
                && computers[i].getMonitor().getHertz() == hz
                && computers[i].getProcessor().getClockSpeed() == clockSpeed) {
                return computers[i];
            }
        }
        return null;
    }

}
