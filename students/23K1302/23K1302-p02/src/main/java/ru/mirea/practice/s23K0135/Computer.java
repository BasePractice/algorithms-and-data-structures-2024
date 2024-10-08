package ru.mirea.practice.s23K0135;

class Computer {
    private final String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Computer{name='" + name + "'}";
    }
}
