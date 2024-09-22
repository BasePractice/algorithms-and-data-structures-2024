package ru.mirea.practice.s0000001;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class program4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int i = 0;
        int min = 10000000;

        while (i < 10) {
            System.out.println("Enter 10 numbers: " + (i+1));
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt();
            }
            i++;
        }

        int sum = Arrays.stream(array).sum();
        int max = Arrays.stream(array).max().getAsInt();
        i = 0;

        do {
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        } while (i < 10);

        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
    }
}
