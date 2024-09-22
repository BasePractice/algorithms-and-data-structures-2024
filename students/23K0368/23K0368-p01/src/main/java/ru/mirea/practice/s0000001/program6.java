package ru.mirea.practice.s0000001;
import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = 0;

        System.out.println("Введите длину последовательности");
        if (sc.hasNextInt()){
            col = sc.nextInt();
        }

        float start = 1;
        for (int i=1; i<col+1; i++){
                float x = start / i;
                System.out.printf("Число %f%n", x);
        }
    }
}
