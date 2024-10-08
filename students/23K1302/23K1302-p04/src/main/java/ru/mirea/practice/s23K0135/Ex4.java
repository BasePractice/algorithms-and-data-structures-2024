package ru.mirea.practice.s23K0135;

public final class Ex4 {

    private Ex4() {
        // Пустота
    }

    public static void main(String[] args) {
        Processor processor = new Processor("Apple M2 Pro", 16, 3.5);
        Memory memory = new Memory("LPDDR5", 16);
        Monitor monitor = new Monitor("3456x2234 Retina", 16);

        Computer computer = new Computer(Brand.APPLE, processor, memory, monitor);

        System.out.println(computer);
    }
}
