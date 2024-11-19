package ru.mirea.practice.s0000001.task5;

public class ThrowsDemo {

    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Details for key: " + key);
    }

    public static void main(String[] args) {
        ThrowsDemo example = new ThrowsDemo();

        try {
            example.getDetails("someKey");
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            example.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

//Использование блока try-catch позволяет обработать исключение внутри метода.
// Однако перехватывать исключение внутри самого метода не всегда является лучшей практикой,
// так как лучше позволить исключению всплыть выше и быть обработанным в контексте,
// где оно имеет больше смысла.
