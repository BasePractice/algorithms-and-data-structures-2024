package ru.mirea.practice.s23k0169.t1;

import java.util.Scanner;

public final class Ex6 {

    private Ex6() {

    }

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            if (args.length == 0) {
                System.out.println("Нет аргументов командной строки");
            } else {
                System.out.println("Аргументы командной строки: ");
                for (int i = 0; i < args.length; i++) {
                    System.out.println("Аргумент " + (i + 1) + ":" + args[i]);
                }
            }
        }
    }
}
