package ru.mirea.practice.s23k0164.t2;

public final class Two {
    private Two(){

    }

    private static void outputOfNumbers(int currentNumber, int totalCount){
        if (totalCount<=0){
            return ;
        }
        System.out.print(currentNumber + " ");
        totalCount--;
        outputOfNumbers(currentNumber+1, totalCount);
    }

    public static void main(String[] args) {
        int n = 10;
        outputOfNumbers(1, n);
    }
}
