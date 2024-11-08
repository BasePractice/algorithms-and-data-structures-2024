package ru.mirea.practice.s23k0823.task1.task1.task2;

public abstract class TestVenom2 {
    public static void main(String[] args) {
        GenericClass2<String, Integer, Double> object = new GenericClass2<>("String", 10, 20.5);
        System.out.println(object.getFieldT() + " " + object.getFieldV() + " " + object.getFieldK());
        object.printClassNames();
        GenericClass2<String, String, String> newObject = new GenericClass2<>("Я", "Мы", "Веном");
        System.out.println(newObject.getFieldT() + " " + newObject.getFieldV() + " " + newObject.getFieldK());
        newObject.printClassNames();
    }
}