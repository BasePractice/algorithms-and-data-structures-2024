package ru.mirea.practice.s23L0908.Task7_8;

public class Magazine {
    public static void printMagazines(Printable[] printables) {
        for (int i = 0; i < printables.length; i++)
            System.out.println(printables[i].getName());
    }
}
