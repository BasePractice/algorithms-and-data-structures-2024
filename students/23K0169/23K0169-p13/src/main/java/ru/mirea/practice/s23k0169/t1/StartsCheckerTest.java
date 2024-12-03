package ru.mirea.practice.s23k0169.t1;

public final class StartsCheckerTest {

    private StartsCheckerTest() {

    }

    public static void main(String[] args) {
        StartsChecker checker = new StartsChecker();

        String example1 = "I like Java programming.";
        String example2 = "Java is cool!";
        String example3 = "I like to learn new things.";
        String example4 = "I Like Java";
        String example5 = "";
        String example6 = null;

        System.out.println("Example 1: \"" + example1 + "\" starts with \"I like\"? " + checker.doesStartWith(example1, "I like"));
        System.out.println("Example 2: \"" + example2 + "\" starts with \"I like\"? " + checker.doesStartWith(example2, "I like"));
        System.out.println("Example 3: \"" + example3 + "\" starts with \"I like\"? " + checker.doesStartWith(example3, "I like"));
        System.out.println("Example 4: \"" + example4 + "\" starts with \"I like\"? " + checker.doesStartWith(example4, "I like"));
        System.out.println("Example 5: \"" + example5 + "\" starts with \"I like\"? " + checker.doesStartWith(example5, "I like"));
        System.out.println("Example 6: null starts with \"I like\"? " + checker.doesStartWith(example6, "I like")); // false
    }
}
