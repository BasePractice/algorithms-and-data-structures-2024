package ru.mirea.practice.s23k0690;

public final class Task4Computer {

    private Task4Computer() {}

    enum Brand {
        DELL,
        HP,
        LENOVO,
        APPLE,
        ASUS
    }

    static class Processor {
        private String model;
        private double speed; // в GHz

        public Processor(String model, double speed) {
            this.model = model;
            this.speed = speed;
        }

        public String getModel() {
            return model;
        }

        public double getSpeed() {
            return speed;
        }

        @Override
        public String toString() {
            return model + " тактовая частота " + speed + " GHz";
        }
    }

    static class Memory {
        private int size; // в GB

        public Memory(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        @Override
        public String toString() {
            return size + " GB";
        }
    }

    static class Monitor {
        private String resolution; // например, "1920x1080"

        public Monitor(String resolution) {
            this.resolution = resolution;
        }

        public String getResolution() {
            return resolution;
        }

        @Override
        public String toString() {
            return resolution;
        }
    }

    static class Computer {
        private Brand brand;
        private Processor processor;
        private Memory memory;
        private Monitor monitor;

        public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
            this.brand = brand;
            this.processor = processor;
            this.memory = memory;
            this.monitor = monitor;
        }

        public Brand getBrand() {
            return brand;
        }

        public Processor getProcessor() {
            return processor;
        }

        public Memory getMemory() {
            return memory;
        }

        public Monitor getMonitor() {
            return monitor;
        }

        @Override
        public String toString() {
            return "Описание компьютера: "
                    + "\nБренд = " + brand
                    + "\nМодель процессора = " + processor
                    + "\nРазмер оперативной памяти = " + memory
                    + "\nРазрешение экрана = " + monitor;
        }
    }

    abstract static class Main {
        public static void main(String[] args) {
            Processor processor = new Processor("AMD Ryzen 7 2700X", 3.7);
            Memory memory = new Memory(16);
            Monitor monitor = new Monitor("1920x1080");
            Computer computer = new Computer(Brand.DELL, processor, memory, monitor);
            System.out.println(computer);
        }
    }
}