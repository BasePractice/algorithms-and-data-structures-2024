package ru.mirea.practice.s0000001;

import java.util.Locale;

public final class StringUtils {

    private StringUtils() {
        throw new UnsupportedOperationException("Utility class should not be instantiated");
    }

    public static char getLastCharacter(String input) {
        return input.charAt(input.length() - 1);
    }

    public static boolean endsWithExclamation(String input) {
        return input.endsWith("!!!");
    }

    public static boolean startsWithILike(String input) {
        return input.startsWith("I like");
    }

    public static boolean containsJava(String input) {
        return input.contains("Java");
    }

    public static int findPositionOfJava(String input) {
        return input.indexOf("Java");
    }

    public static String replaceAwithO(String input) {
        return input.replace('а', 'о');
    }

    public static String convertToUpperCase(String input) {
        return input.toUpperCase(Locale.ENGLISH);
    }

    public static String convertToLowerCase(String input) {
        return input.toLowerCase(Locale.ENGLISH);
    }

    public static String extractSubstringJava(String input) {
        int positionOfJava = findPositionOfJava(input);
        if (positionOfJava != -1) {
            return input.substring(positionOfJava, positionOfJava + "Java".length());
        } else {
            return "Substring 'Java' not found.";
        }
    }

    public static void processString(String input) {
        // 1. Print the last character of the string
        char lastChar = getLastCharacter(input);
        System.out.println("Last character: " + lastChar);

        // 2. Check if the string ends with "!!!"
        boolean endsWithExclamation = endsWithExclamation(input);
        System.out.println("Ends with '!!!': " + endsWithExclamation);

        // 3. Check if the string starts with "I like"
        boolean startsWithILike = startsWithILike(input);
        System.out.println("Starts with 'I like': " + startsWithILike);

        // 4. Check if the string contains "Java"
        boolean containsJava = containsJava(input);
        System.out.println("Contains 'Java': " + containsJava);

        // 5. Find the position of the substring "Java"
        int positionOfJava = findPositionOfJava(input);
        System.out.println("Position of 'Java': " + positionOfJava);

        // 6. Replace all occurrences of 'а' with 'о'
        String replacedString = replaceAwithO(input);
        System.out.println("String after replacing 'а' with 'о': " + replacedString);

        // 7. Convert the string to upper case using Locale
        String upperCaseString = convertToUpperCase(input);
        System.out.println("String in upper case: " + upperCaseString);

        // 8. Convert the string to lower case using Locale
        String lowerCaseString = convertToLowerCase(input);
        System.out.println("String in lower case: " + lowerCaseString);

        // 9. Extract the substring "Java" using String.substring()
        String substringJava = extractSubstringJava(input);
        System.out.println(substringJava);
    }

    public static void main(String[] args) {
        String testString = "I like Java!!!";
        processString(testString);
    }
}
