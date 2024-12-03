package ru.mirea.practice.s23k0116.task1;

public abstract class StartsCheckerTest {
    public static void main(String[] args) {
        StartsChecker checker = new StartsChecker();

        String example1 = "I like Java programming.";
        String example2 = "Java is cool!";
        String example3 = "";
        String example4 = null;

        System.out.println(example1 + " " + checker.doesStartWith(example1, "I like"));
        System.out.println(example2 + " " + checker.doesStartWith(example2, "I like"));
        System.out.println(example3 + " " + checker.doesStartWith(example3, "I like"));
        System.out.println(example4 + " " + checker.doesStartWith(example4, "I like"));
    }
}
