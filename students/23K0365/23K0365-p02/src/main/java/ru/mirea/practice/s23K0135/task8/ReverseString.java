package ru.mirea.practice.s23K0135.task8;

public abstract class ReverseString {
    public static void main(String[] args) {
        String[] arrStart = {"qwer", "asdf", "zxcv", "rytu", "finish"};
        System.out.println("START:");
        for (String i : arrStart) {
            System.out.print(i + " ");
        }
        System.out.println("\n ");

        int left = 0;
        int right = arrStart.length - 1;

        while (left < right) {
            String a = arrStart[left];
            arrStart[left] = arrStart[right];
            arrStart[right] = a;
            left++;
            right--;
        }
        System.out.println("FINISH:");
        for (String i : arrStart) {
            System.out.print(i + " ");
        }

    }
}
