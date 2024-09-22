package ru.mirea.practice.s0000001;
import java.util.Arrays;
import java.util.Scanner;

public class programs3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int [10];
        int x = 2;
        int sr = 0;
        int sum = 0;
        int i = 0;
        for (i=0; i<10; i++){
            System.out.print("Введите целоечисло: ");
            if(sc.hasNextInt()) {
                x = sc.nextInt();
                array[i] = x;
                System.out.println(Arrays.toString(array));
            } else {
                System.out.println("Вы ввели не целое число");
            }}
        sum = Arrays.stream(array).sum();
        sr = sum / i;
        System.out.print("Сумма: " + sum + " Среднее: " + sr);
    }
}