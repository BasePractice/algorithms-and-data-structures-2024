package ru.mirea.practice.s0000001;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author s = new Author("name","@mail.ru",'m');
        System.out.println(s.getName());
        System.out.println(s.getEmail());
        System.out.println(s.getGender());
        s.setEmail("@gmail.com");
        System.out.println(s.toString());
    }
}