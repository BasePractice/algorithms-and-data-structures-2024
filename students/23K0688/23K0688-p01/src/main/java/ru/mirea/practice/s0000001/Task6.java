package ru.mirea.practice.s0000001;

public abstract class Task6 {
    public static void main(String[] args) {
        for (int i = 0;i < 10;i++) {
            float num = 1f / (i + 1);
            System.out.printf("num%d=%.2f%n",i + 1,num);
        }
    }

}
