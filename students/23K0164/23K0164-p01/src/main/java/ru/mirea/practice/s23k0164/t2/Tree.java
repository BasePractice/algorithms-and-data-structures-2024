package ru.mirea.practice.s23k0164.t2;

import java.util.Random;

public final class Tree {

    private Tree(){

    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(99) + 10;
        }
        int flag = 1;
        int flag2 = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>arr[i]) {
                flag = 0;
            }
            if (arr[i-1]<arr[i]){
                flag2 = 0;
            }
        }

        System.out.println("Сгенерированный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        if (flag==1) {
            System.out.print("Последовательность возрастает ");
        }else{
            if (flag2==1)
            {
                System.out.print("Последовательность убывает");
            }else{
                System.out.print("Последовательность никакая");
            }
        }

    }
}
