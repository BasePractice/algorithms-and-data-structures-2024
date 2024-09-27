package ru.mirea.practice.s0000001.task1;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Joh", "john@gmail.com", 'M');
        System.out.println(author);
        author.setEmail("john@gmail.com");
        System.out.println(author);
    }
}
