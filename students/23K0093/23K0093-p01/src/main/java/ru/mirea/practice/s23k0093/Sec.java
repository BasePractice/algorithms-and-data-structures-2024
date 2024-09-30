package ru.mirea.practice.s23k0093;

//Написать программу, которая с помощью метода класса, вычисляет
//факториал числа (использовать управляющую конструкцию цикла), проверить
//работу метода.

public abstract class Sec {
    public static void main(String[] args) {
        int b = 5;
        Fact res = new Fact(b);
        int r = res.factorial();
        System.out.printf("Факториал %d равен %d", b, r);
    }
}
