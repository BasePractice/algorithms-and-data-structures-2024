package ru.mirea.practice.s0000001.task2;

public class MyClass<T, V, K> {
    private T firstVariable;
    private V secondVariable;
    private K thirdVariable;


    public MyClass(T firstVariable, V secondVariable, K thirdVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thirdVariable = thirdVariable;
    }


    public T getFirstVariable() {
        return firstVariable;
    }

    public V getSecondVariable() {
        return secondVariable;
    }

    public K getThirdVariable() {
        return thirdVariable;
    }


    public void printClassNames() {
        System.out.println("Class of first variable: " + firstVariable.getClass().getName());
        System.out.println("Class of second variable: " + secondVariable.getClass().getName());
        System.out.println("Class of third variable: " + thirdVariable.getClass().getName());
    }

    public static void main(String[] args) {
        MyClass<String, Integer, Double> myObject = new MyClass<>("Hello", 10, 15.5);
        myObject.printClassNames();
    }
}
