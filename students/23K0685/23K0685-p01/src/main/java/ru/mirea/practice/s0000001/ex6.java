package ru.mirea.practice.s0000001;

public class ex6 {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        for (int x = 1; x<10;x++){
            String sbuf = Integer.toString(x);
            s1 = s1 + "1 ";
            s2 = s2 + "- ";
            s3 = s3 + sbuf + " ";
            if (x!=9){
                s1 = s1 + "  ";
                s2 = s2 + "+ ";
                s3 = s3 + "  ";
            }
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
