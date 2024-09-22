package ru.mirea.practice.s0000001;
import java.util.Arrays;
import java.util.Scanner;

public class programs3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {0,1,2,3,4,5,6,7,8,9,10};
        int sr = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sr = sum / array.length;
        System.out.print("Сумма: " + sum + " Среднее: " + sr);
    }
}