package mirea.lab9;

import java.util.Scanner;

abstract class Task7 {
    public static int fact(int toNumb) {
        if (toNumb < 2) {
            return 1;
        } else {
            int answ = 1;
            for (int i = 2; i <= toNumb; i++) {
                answ = answ * i;
            }
            return answ;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число, для которого найдётся факториал");
            int numb = sc.nextInt();
            if (numb < 1) {
                System.out.println("Число должно быть натуральным (>0)");
            } else {
                System.out.format("Факториал числа %s: %s", numb, fact(numb));
            }
        }
    }
}
