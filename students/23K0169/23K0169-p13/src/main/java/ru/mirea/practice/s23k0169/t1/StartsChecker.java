package ru.mirea.practice.s23k0169.t1;

public class StartsChecker {

    public boolean doesStartWith(String input, String prefix) {
        if (input == null || prefix == null) {
            return false;
        }
        return input.startsWith(prefix);
    }
}