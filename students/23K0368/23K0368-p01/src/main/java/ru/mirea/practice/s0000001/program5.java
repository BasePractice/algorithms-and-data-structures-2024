package ru.mirea.practice.s0000001;
import java.util.Arrays;

public class program5 {
    public static void main(String[] args) {
            for (String arg : args) {
                System.out.println(arg);
            }
            System.out.println(Arrays.toString(args));
    }
}