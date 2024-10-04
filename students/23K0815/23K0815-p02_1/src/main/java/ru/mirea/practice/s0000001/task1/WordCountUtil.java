package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class WordCountUtil {

    private static final Logger logger = Logger.getLogger(WordCountUtil.class.getName());

    private WordCountUtil() {
        throw new UnsupportedOperationException("Utility class shouldв not be instantiated");
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        int counter = 0;
        boolean flag = true;

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (currentChar != ' ') {
                if (flag) {
                    counter++;
                    flag = false;
                }
            } else {
                flag = true;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println("Enter string:");

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