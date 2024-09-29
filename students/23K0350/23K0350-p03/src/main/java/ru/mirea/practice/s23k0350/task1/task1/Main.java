package ru.mirea.practice.s23k0350.task1.task1;


public abstract class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(5);
        tester.printCircles();
        System.out.println("Самый маленький: " + tester.getSmallestCircle().getRadius());
        System.out.println("Самый большой: " + tester.getLargestCircle().getRadius());
        tester.sortCircles();
        System.out.println("Отсортированные круги:");
        tester.printCircles();
    }
}
