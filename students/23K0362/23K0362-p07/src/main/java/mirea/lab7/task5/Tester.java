package mirea.lab9.task5;

abstract class Tester {
    public static void main(String[] args) {
        StringOperations stringOperations = new String1();

        String testString = "Hello, I am student!";

        System.out.println("Количество символов: " + stringOperations.lenString(testString));
        System.out.println("Символы на нечетных позициях: " + stringOperations.makeStringOddPositions(testString));
        System.out.println("Инвертированная строка: " + stringOperations.invertString(testString));
    }
}
