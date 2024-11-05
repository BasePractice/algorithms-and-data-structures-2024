package ru.mirea.practice.pr3;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "john.doe@example.com", 'M');

        System.out.println("Имя автора: " + author.getName());
        System.out.println("Email автора: " + author.getEmail());
        System.out.println("Пол автора: " + author.getGender());

        author.setEmail("john.newemail@example.com");
        System.out.println("Новый email автора: " + author.getEmail());

        System.out.println(author.toString());
    }
}
