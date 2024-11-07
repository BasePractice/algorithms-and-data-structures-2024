package mirea.lab9.task4;

abstract class Tester {
    public static void main(String[] args) {
        MarksComputers[] marksComputers = MarksComputers.values();
        Processor pr1 = new Processor("Intel i5 14600KF", 4900, 6);
        Memory m1 = new Memory("Crucial x8", 6200);
        Monitor mon1 = new Monitor("Samsung N156", 15.6);
        Computer comp1 = new Computer(marksComputers[0].toString(), pr1, m1, mon1);

        System.out.println(comp1.toString());
    }
}
