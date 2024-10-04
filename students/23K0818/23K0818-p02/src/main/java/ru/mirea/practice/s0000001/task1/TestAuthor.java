package ru.mirea.practice.s0000001.task1;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "john.doe@example.com", 'M');

        System.out.println("Author's name: " + author.getName());
        System.out.println("Author's email: " + author.getEmail());
        System.out.println("Author's gender: " + author.getGender());

        System.out.println(author.toString());
    }
}
