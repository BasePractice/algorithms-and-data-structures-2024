package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class WordCountUtil {

    private static final Logger logger = Logger.getLogger(WordCountUtil.class.getName());

    // Private constructor to prevent instantiation
    private WordCountUtil() {
        throw new UnsupportedOperationException("Utility class should not be instantiated");
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0; // Return 0 for null or empty strings
        }

        int counter = 0;
        boolean flag = true;

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (currentChar != ' ') {
                if (flag) {
                    counter++;
                    flag = false; // Next characters are not a space
                }
            } else {
                flag = true; // Found a space, next character will be checked
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println("Enter string:");

        // Use try-with-resources to ensure automatic resource management
        try (Scanner scanner = new Scanner(System.in)) {
            String sentence = scanner.nextLine();
            int wordCount = countWords(sentence);
            System.out.println("The number of words entered: " + wordCount);
        } catch (Exception e) {
            // Log the error with a more robust logging framework
            logger.log(Level.SEVERE, "An error occurred while counting words", e);
        }
    }
}