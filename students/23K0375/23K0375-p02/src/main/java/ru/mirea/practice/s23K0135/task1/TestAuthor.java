package ru.mirea.practice.s23K0135.task1;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Newman", "johnvonNew@gmail.com", 'M');
        System.out.println(author);
        author.setEmail("john@gmail.com");
        System.out.println(author);
    }
}

