package mirea.lab14;

import java.util.Scanner;

/* Написать регулярное выражение, определяющее является ли данная
строка строкой "abcdefghijklmnopqrstuv18340" или нет. */

public abstract class Prac14p2 {
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
