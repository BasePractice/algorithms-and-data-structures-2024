package ru.mirea.practice.s0000001;

public abstract class Fifth {
    public static void main(String[] args) {
        String s = "+104289652211";
        String cc = s.substring(0,s.length() - 10);
        String num = s.substring(s.length() - 10);
        System.out.println(cc);
        System.out.println(cc + num.substring(0,3) + "-" + num.substring(3,6) + "-" + num.substring(6));
    }
}
