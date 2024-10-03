package ru.mirea.practice.s0000001;

public class ex7 {
    public int Factorial(int strt) {
        int Res = 1;
        for (int i = 1; i < strt+1;i++) {
            Res = Res * i;
        }
        return Res;
    }
    public static void main(String[] args) {
        ex7 gd = new ex7();
        System.out.println(gd.Factorial(5));
    }
}

