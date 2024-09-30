package ru.mirea.practice.s0000001;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elems: ");
        num = sc.nextInt();
        int[] numbers = new int[num];
        System.out.println(num);
        for (int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(numbers);
    }
}
