package ru.mirea.practice.s0000001.task1;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Joe","Joe.com",'f');
        System.out.println(a1);
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        a1.setEmail("Go.com");
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
    }
}
