package ru.mirea.practice.s23K0135;

public abstract class TaskEight {
    public static boolean polindr(String w, int l, int r) {
        if (l >= r) {
            return true;
        }
        if (w.charAt(l) != w.charAt(r)) {
            return false;
        }
        return polindr(w,l + 1, r - 1);
    }

    public static void main(String[] args) {
        String words = "qwer rewq";
        if (polindr(words, 0, words.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO!");
        }
    }
}
