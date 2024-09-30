package ru.mirea.practice.s23k0362.comp;

class Computerr {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computerr(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
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

    // Метод для вывода информации о компьютере
    public void printInfo() {
        System.out.println("Brand: " + brand.getBrand());
        System.out.println("Processor: " + processor.getprocessorName() + ", сокет: " + processor.socetProcessor
                            + ", (" + processor.getamountCoresprocessor() + " cores, " + " "
                            + processor.amountStreemprocessor + " потоков," + " cash " + processor.cahProcessor + ", "
                            + processor.gethzproxessor() + " GHz)");
        System.out.println("Memory: " + memory.getnameMemory() + " " + memory.gettypeMemory() + " "
                            + memory.getvolumeMemory() + "Gb " + memory.gethzMemory() + "GHz");
        System.out.println("Monitor: " + monitor.getnameMonitor() + " Соотношение сторон: "
                            + monitor.getaspectRatiomonitore() + ", " + monitor.getsizeMonitore()
                            + ", разрешение монитора: " + monitor.getpermissionMonitore() + ", "
                            + monitor.gethzmonitore() + "GHz, Глубина цвета: " + monitor.getcolorDepthmonitore()
                            + ", время отклика " + monitor.gettimeMonitore() + "mc");
    }
}
