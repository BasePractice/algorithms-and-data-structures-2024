package ru.mirea.practice.s23k0143;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Павел", "email@mailru", 'M');
        System.out.println(author);

        System.out.println("Имя: " + author.getName());
        System.out.println("Электронная почта: " + author.getEmail());
        System.out.println("Гендер: " + author.getGender());

        author.setEmail("new_email@mail.ru");
        System.out.println("Обновленная электронная почта: " + author.getEmail());

        System.out.println(author);
    }
}
