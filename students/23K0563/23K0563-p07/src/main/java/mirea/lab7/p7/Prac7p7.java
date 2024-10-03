package mirea.lab7.p7;

public abstract class Prac7p7 {
    public static void main(String[] args) {
        Printable[] a = new Printable[]{
            new Book("Война и Мир", "Л.Н.Толстой", 1863),
            new Magazine("Хакер"),
            new Magazine("Ракета")};
        Magazine.printMagazines(a);
    }
}
