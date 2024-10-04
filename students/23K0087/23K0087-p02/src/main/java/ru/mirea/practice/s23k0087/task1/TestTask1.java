package ru.mirea.practice.s23k0087.task1;

public abstract class TestTask1 {

    public static void main(String[] args) {
        Author jamesAuthor = new Author("James Gosling", "jamesgosling@example.com", 'm');
        System.out.println(jamesAuthor);
        System.out.println("Имя автора: " + jamesAuthor.getName());
        System.out.println("Эл. почта автора: " + jamesAuthor.getEmail());
        System.out.println("Пол автора: " + jamesAuthor.getGender());
        jamesAuthor.setEmail("wrongemail");
        jamesAuthor.setEmail("notryangosling@example.com");
        System.out.println("Новая эл. почта автора: " + jamesAuthor.getEmail());
    }
}
