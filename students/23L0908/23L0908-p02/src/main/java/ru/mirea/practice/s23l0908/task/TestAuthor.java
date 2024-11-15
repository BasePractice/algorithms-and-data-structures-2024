package ru.mirea.practice.s23l0908.task;

public final class TestAuthor {

    private TestAuthor() {
    }

    public static void main(String[] args) {
        Author author = new Author("Nguyen", "ok.com", 'm');
        System.out.println(author);
        author.setEmail("hoangpphong11@gmail.com");
        author.setName("Hoang Xuan Phong");
        author.setGender('m');
        System.out.println("Updated name: " + author.getName());
        System.out.println("Updated email: " + author.getEmail());
        System.out.println("Updated gender: " + author.getGender());
        System.out.println(author);
    }
}

