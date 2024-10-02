package ru.mirea.practice.s0000002.task1;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "john.doe@example.com", 'm');
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
        author.setEmail("john.newemail@example.com");
        System.out.println("Updated Email: " + author.getEmail());
        System.out.println(author.toString());
    }
}
