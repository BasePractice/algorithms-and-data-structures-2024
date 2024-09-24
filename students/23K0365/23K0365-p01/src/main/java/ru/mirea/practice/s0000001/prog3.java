package ru.mirea.practice.s0000001;
import java.util.Arrays;
import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ln = 3, sr =0, sum=0;
        System.out.println("lenght of array = " + ln);
        int [] b = new int [ln];
        for (int i=0;i<ln;i++){b[i]=sc.nextInt();}
        sum = Arrays.stream(b).sum();
        sr=sum/ln;
        System.out.println("summary: "+sum+"; srednee: "+sr);
    }}
