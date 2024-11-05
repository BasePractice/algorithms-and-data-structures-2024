package ru.mirea.practice.s23k0164.t1;

public final class TestAuthor {

    private TestAuthor() {

    }

    public static void main(String[] args) {
        Author author = new Author("Лев Толстой", "tolstoy@example.com", 'М');
        System.out.println("Исходная информация об авторе:");
        System.out.println(author);
        System.out.println("\nТестирование геттеров:");
        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
        System.out.println("\nИзменение email:");
        author.setEmail("lev.tolstoy@example.com");
        System.out.println("Новый email: " + author.getEmail());
        System.out.println("\nОбновленная информация об авторе:");
        System.out.println(author);
    }
}

