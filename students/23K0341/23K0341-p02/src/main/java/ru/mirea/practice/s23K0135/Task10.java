package ru.mirea.practice.s23K0135;

import java.util.Objects;
import java.util.Scanner;

/***************************************************************
 * Напишите программу HowMany.java, которая определит, сколько *
 * слов Вы ввели с консоли                                     *
 ***************************************************************/

public abstract class Task10 { // Данная программа нызывается HowMany.java
    public static void main(String[] args) {
        int c = 0;
        try (Scanner sc = new Scanner(System.in)) {
            String input = " ";
            while (!Objects.equals(input, "")) {
                input = sc.nextLine();
                if (!Objects.equals(input, "")) {
                    ++c;
                }
            }
            sc.close();

            System.out.println("Было введено строк в количестве " + c + ".");
        }
    }
}
