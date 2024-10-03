package ru.mirea.practice.s0000002;

/***************************************************************
 * Написать программу, в результате которой выводятся на экран *
 * аргументы командной строки в цикле for.                     *
 ***************************************************************/

public abstract class Task5 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            System.out.println("Аргумент №" + (i + 1) + ": " + args[i]);
        }
    }
}
