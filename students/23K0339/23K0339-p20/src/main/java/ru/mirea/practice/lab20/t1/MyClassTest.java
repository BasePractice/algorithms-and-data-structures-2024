package ru.mirea.practice.lab20.t1;

public abstract class MyClassTest {
    public static void main(String[] args) {
        MyClass<String, Dog, Integer> myClass = new MyClass<>("Test", new Dog(), 100);
        myClass.printClasses();
        System.out.println("T: " + myClass.getT());
        System.out.println("V: " + myClass.getV());
        System.out.println("K: " + myClass.getK());
    }
}

