package ru.mirea.practice.s0000001.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class NameSearch {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("[A-Za-z]+");
        String exa = "Nikita, Andrey, Fedor, Mikhail.";
        System.out.println("Searching of names\n" + exa);
        Matcher m1 = p1.matcher(exa);
        while (m1.find()) {
            System.out.println("Name: " + exa.substring(m1.start(), m1.end()) + "\n");
        }
    }
}
