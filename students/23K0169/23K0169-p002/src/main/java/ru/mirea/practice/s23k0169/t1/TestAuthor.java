package ru.mirea.practice.s23k0169.t1;

public final class TestAuthor {

    private TestAuthor() {

    }

    public static void main(String[] args) {
        Author author = new Author("Набиева Александра", "nabieva@example.com", 'Ж');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());

        author.setEmail("alexandra@example.com");

        System.out.println(author);
    }
}
