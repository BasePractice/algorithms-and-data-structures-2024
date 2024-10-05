package ru.mirea.practice.s23L0908;

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
