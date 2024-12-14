package ru.mirea.practice.s0000001;

abstract class RegexTest {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";

        String correctString = "abcdefghijklmnopqrstuv18340";
        String incorrectString1 = "abcdefghijklmnoasdfasdpqrstuv18340";
        String incorrectString2 = "abcdefghijklmnopqrstuv18340extra";

        System.out.println(correctString.matches(regex));
        System.out.println(incorrectString1.matches(regex));
        System.out.println(incorrectString2.matches(regex));
    }
}
