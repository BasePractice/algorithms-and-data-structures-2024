package ru.mirea.practice.s23k0215;

public abstract class TestAuthor {
    public static void main(String[] args) {
        // Создаем объект класса Author
        Author author = new Author("John Doe", "john@example.com", 'M');

        // Тестируем геттеры
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());

        // Изменяем email и проверяем
        author.setEmail("newemail@example.com");
        System.out.println("Updated Email: " + author.getEmail());

        // Тестируем метод toString
        System.out.println(author.toString());
    }
}

