package ru.mirea.practice.s23k0359.studyperson.task5;

public abstract class Test {
    public static void main(String[] args) {
        Processable process = new ProcessStrings();
        String quote = "We live in an age in which there is no heroic death.";
        System.out.println(process.inverter(quote));
        System.out.println(process.counter(quote));
        System.out.println(process.replacer(quote));
    }
}