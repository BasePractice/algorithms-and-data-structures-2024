package ru.mirea.practice.lab21.t2;

abstract class GenericTest {
    public static void main(String[] args) {
        String[] stringArray = {"Два","Ква","Ма"};
        GenericArray<String> genericStringArray = new GenericArray<>(stringArray);
        System.out.println("Массив строк: " + String.join(", ", genericStringArray.getArray()));

    }
}
