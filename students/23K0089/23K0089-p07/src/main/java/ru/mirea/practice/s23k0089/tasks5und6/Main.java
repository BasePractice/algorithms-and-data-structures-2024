package ru.mirea.practice.s23k0089.tasks5und6;

public abstract class Main {
    public static void main(String[] args) {
        StringOperations processer = new ProcessString();
        String s = "Let the first to be the last.";
        
        System.out.println(processer.countChars(s, 't'));
        System.out.println(processer.oddPlaces(s));
        System.out.println(processer.invert(s));
    }
}
