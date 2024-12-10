package ru.mirea.practice.s23k0375.task1;

import java.util.Locale;

public abstract class StrManipul {

    public static void main(String[] args) {
        String str = "I like Java!!!";
        manipulateString(str);
    }

    public static void manipulateString(String str) {
        // 1. Распечатать последний символ строки
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // 2. Проверить, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Строка заканчивается на '!!!': " + endsWithExclamation);

        // 3. Проверить, начинается ли строка подстрокой "I like"
        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Строка начинается с 'I like': " + startsWithILike);

        // 4. Проверить, содержит ли строка подстроку "Java"
        boolean containsJava = str.contains("Java");
        System.out.println("Строка содержит 'Java': " + containsJava);

        // 5. Найти позицию подстроки "Java" в строке
        int javaPosition = str.indexOf("Java");
        System.out.println("Позиция подстроки 'Java': " + javaPosition);

        // 6. Заменить все символы "а" на "о"
        String replacedStr = str.replace('a', 'o');
        System.out.println("Строка после замены 'a' на 'o': " + replacedStr);

        // 7. Преобразовать строку к верхнему регистру
        String upperCaseStr = str.toUpperCase(Locale.ENGLISH);
        System.out.println("Строка в верхнем регистре: " + upperCaseStr);

        // 8. Преобразовать строку к нижнему регистру
        String lowerCaseStr = str.toLowerCase(Locale.ENGLISH);
        System.out.println("Строка в нижнем регистре: " + lowerCaseStr);

        // 9. Вырезать строку "Java"
        String substring = str.substring(7, 11);
        System.out.println("Вырезанная подстрока 'Java': " + substring);
    }
}
