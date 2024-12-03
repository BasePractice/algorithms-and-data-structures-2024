package ru.mirea.practice.s0000001.task1;

public class StringProcessor implements StringOperations {

    @Override
    public int countCharacters(String s) {
        if (s == null) {
            return 0;
        }
        return s.length();
    }

    @Override
    public String getOddPositionedCharacters(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder oddChars = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                oddChars.append(s.charAt(i));
            }
        }
        return oddChars.toString();
    }

    @Override
    public String invertString(String s) {
        if (s == null) {
            return "";
        }
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        String inputString = "ExampleString";

        System.out.println("Количество символов: " + processor.countCharacters(inputString));

        System.out.println("Символы на нечетных позициях: " + processor.getOddPositionedCharacters(inputString));

        System.out.println("Инвертированная строка: " + processor.invertString(inputString));
    }
}

