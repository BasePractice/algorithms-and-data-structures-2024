package ru.mirea.practice.s0000001.task5;

import java.util.Scanner;

public abstract class Tes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("n1= + and 10 numbers");
            String num1 = sc.nextLine();
            System.out.println("n2= 10 numbers");
            String num2 = sc.nextLine();
            Phonemaker ph = new Phonemaker();
            num1 = ph.randomcountry(num1);
            num2 = ph.ruscountry(num2);
            System.out.println("n1=" + num1);
            System.out.println("n2=" + num2);
        }
    }
}
