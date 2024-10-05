package ru.mirea.practice.s0000001;

/**
 * Задание 4
 * Создать класс, описывающий сущность компьютер (Computer). Для
 * описания составных частей компьютера использовать отдельные классы
 * (Processor, Memory, Monitor). Описать необходимые свойства и методы для
 * каждого класса. Для названий марок компьютера используйте перечисления
 * (enum)
 */

public abstract class Task4 {
    public static void main(String[] args) {
        System.out.println(new Computer(
                new Monitor(15.6, 1920, 1080, 144, Manufacturer.BENQ),
                new Memory(4800, 2 << 8, Manufacturer.Samsung),
                new Processor(8, 4800, Manufacturer.AMD)));
    }

    enum Manufacturer {
        ASUS,
        Samsung,
        AMD,
        Crucial,
        BENQ,
        Philips;
    }

    static class Computer {
        Monitor monitor;
        Memory memory;
        Processor processor;

        public Computer(Monitor monitor, Memory memory, Processor processor) {
            this.monitor = monitor;
            this.memory = memory;
            this.processor = processor;
        }

        @Override
        public String toString() {
            return "Computer {\n\t"
                    + "monitor=" + monitor + ";\n\tmemory="
                    + memory + ";\n\tprocessor=" + processor + "\n}";
        }
    }

    static class Monitor {
        double diagonal;
        int width;
        int height;
        int refreshRate;
        Manufacturer manufacturer;

        Monitor(double diagonal, int width, int height, int refreshRate, Manufacturer manufacturer) {
            this.diagonal = diagonal;
            this.width = width;
            this.height = height;
            this.refreshRate = refreshRate;
            this.manufacturer = manufacturer;
        }

        @Override
        public String toString() {
            return "Monitor { " + "diagonal=" + diagonal + ", width=" + width
                    + ", height=" + height + ", refresh rate="
                    + refreshRate + ", manufacturer=" + manufacturer + " }";
        }
    }

    static class Memory {
        int speed;
        int capacity;
        Manufacturer manufacturer;

        public Memory(int speed, int capacity, Manufacturer manufacturer) {
            this.speed = speed;
            this.capacity = capacity;
            this.manufacturer = manufacturer;
        }

        @Override
        public String toString() {
            return "Memory { " + "speed=" + speed + ", capacity="
                    + capacity + ", manufacturer=" + manufacturer + " }";
        }
    }

    static class Processor {
        int cores;
        double basespeed;
        Manufacturer manufacturer;

        public Processor(int cores, double basespeed, Manufacturer manufacturer) {
            this.cores = cores;
            this.basespeed = basespeed;
            this.manufacturer = manufacturer;
        }

        @Override
        public String toString() {
            return "Processor { " + "cores=" + cores + ", base speed=" + basespeed
                    + ", manufacturer=" + manufacturer + " }";
        }
    }
}
