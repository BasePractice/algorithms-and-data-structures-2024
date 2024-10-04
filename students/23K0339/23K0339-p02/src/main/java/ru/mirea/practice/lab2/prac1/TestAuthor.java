package ru.mirea.practice.lab2.prac1;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Messi", "messi@gmail.ru", 'M');
        System.out.println(author);
        System.out.println("Name - " + author.getName());
        System.out.println("Email - " + author.getEmail());
        System.out.println("Gender - " + author.getGender());
        author.setEmail("Mes1Cool@gmail.ru");
        System.out.println("Current email - " + author.getEmail());
    }
}
