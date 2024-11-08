package ru.mirea.practice.s23k0690;

final class Task4 {

    private Task4() {}

    public static void main(String[] args) {
        GenericClass2<String, Integer, Double> genericObject = new GenericClass2<>("Hello", 123, 45.67);
        System.out.println("First Parameter: " + genericObject.getFirstParameter());
        System.out.println("Second Parameter: " + genericObject.getSecondParameter());
        System.out.println("Third Parameter: " + genericObject.getThirdParameter());
        genericObject.printClassNames();
    }
}
