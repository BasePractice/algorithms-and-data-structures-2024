package ru.mirea.practice.s0000001.task7;

public abstract class BookTest {
    public static void main(String[] args) {
        Book b = new Book("Washington","life's enjoy",1999);
        Book b1 = new Book("Unknown","be patient",1235);
        Book b2= new Book("asdf","k3ep it cool",1987);
        Book b3 = new Book("Thomas","dude",1945);

        System.out.println(b.getAuthor());
        b.setname("Happy End");
        System.out.println(b.getname());
        System.out.println(b+"\n\n");

        BookShlef bOOks = new BookShlef(4);
        bOOks=bOOks.adding(bOOks,b);
        bOOks=bOOks.adding(bOOks,b1);
        bOOks=bOOks.adding(bOOks,b2);
        bOOks=bOOks.adding(bOOks,b3);

        System.out.println(bOOks+"\n");

        System.out.println("Latest:\n"+bOOks.findLatest(bOOks));
        System.out.println("Newest:\n"+bOOks.findNewest(bOOks));

        System.out.println();
        System.out.println(bOOks.sortByYear(bOOks));
    }
}
