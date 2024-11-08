package mirea.lab13;

import java.util.Locale;
import java.util.Scanner;

public abstract class Prac13p1 {
    public static String p1(String s) {
        return s;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            String s = sc.nextLine();
            System.out.println("P1: " + p1(s));
            System.out.println("P2: " + s.charAt(s.length() - 1));
            System.out.println("P3: " + s.endsWith("!!!"));
            System.out.println("P4: " + s.startsWith("I like"));
            System.out.println("P5: " + s.contains("Java"));
            System.out.println("P6: " + s.lastIndexOf("Java"));
            System.out.println("P7: " + s.replace("a", "o"));
            System.out.println("P8: " + s.toUpperCase(Locale.getDefault()));
            System.out.println("P9: " + s.toLowerCase(Locale.getDefault()));
            System.out.println("P10: " + s.substring(s.lastIndexOf("Java"), s.lastIndexOf("Java") + 4));
        }
    }
}
