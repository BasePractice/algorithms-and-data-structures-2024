package mirea.lab9.task1;

abstract class TestAuthor {
    public static void main(String[] args) {
        Author aut1 = new Author("Jonson", "jonson@mail.com", 'm');
        System.out.println(aut1.toString());
        aut1.setName("Boris");
        aut1.setEmail("boris@gmail.com");
        System.out.println(aut1.toString());
    }
}
