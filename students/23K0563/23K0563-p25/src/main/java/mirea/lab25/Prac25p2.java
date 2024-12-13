package mirea.lab25;

import java.util.Scanner;

public abstract class Prac25p2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String ex = "abcdefghijklmnopqrstuv18340";
            System.out.print("Введите строку: ");
            String inp = sc.nextLine();
            if (inp.matches(ex)) {
                System.out.println("Строка совпадает с " + ex);
            } else {
                System.out.println("Строка не совпадает с " + ex);
            }
        }
    }
}
