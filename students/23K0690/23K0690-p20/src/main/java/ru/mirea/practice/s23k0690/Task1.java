package ru.mirea.practice.s23k0690;

final class Task1 {

    private Task1() {}

    public static void main(String[] args) {
        GenericClass1<String, Integer, Double> genericObject = new GenericClass1<>("Hello", 123, 45.67);
        System.out.println(genericObject);
    }
}