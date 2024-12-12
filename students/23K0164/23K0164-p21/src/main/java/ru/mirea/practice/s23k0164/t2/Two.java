package ru.mirea.practice.s23k0164.t2;

public final class Two {
    private Two() {

    }

    public static void main(String[] args) {

        GenericArray<Integer> intArray = new GenericArray<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        System.out.println("Integer Array: " + intArray);


        GenericArray<String> stringArray = new GenericArray<>();
        stringArray.add("Hello");
        stringArray.add("World");
        System.out.println("String Array: " + stringArray);


        GenericArray<Double> doubleArray = new GenericArray<>();
        doubleArray.add(3.14);
        doubleArray.add(2.71);
        System.out.println("Double Array: " + doubleArray);


        GenericArray<Object> mixedArray = new GenericArray<>();
        mixedArray.add(100);
        mixedArray.add("Test");
        mixedArray.add(3.14159);
        System.out.println("Mixed Array: " + mixedArray);
    }
}
