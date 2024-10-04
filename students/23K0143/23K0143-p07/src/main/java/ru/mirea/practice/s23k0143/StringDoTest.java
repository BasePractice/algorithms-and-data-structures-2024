package ru.mirea.practice.s23k0143;

public abstract class StringDoTest {
    public static void main(String[] args) {
        StringInterface stringInterface = new StringDo();
        String str = "Строка для примера";

        int count = stringInterface.cnt(str);
        System.out.println("Количество символов в строке: " + count);

        String oddChars = stringInterface.oddCharacters(str);
        System.out.println("Символы на нечетных позициях: " + oddChars);

        String inverted = stringInterface.invertString(str);
        System.out.println("Инвертированная строка: " + inverted);
    }
}
