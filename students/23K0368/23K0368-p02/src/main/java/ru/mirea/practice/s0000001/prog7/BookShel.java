package ru.mirea.practice.s0000001.prog7;
import java.util.Arrays;

public class BookShel {

    public static Book[] polka = new Book[5];

    public void release(){
        int min = 1000;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            Integer cmt = polka[i].getYear();
            if (cmt < min){ min = cmt;}
            if (cmt > max){ max = cmt;}
        }
    }


    public static void ssort(){
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (polka[i].getYear() > polka[j].getYear()) {
                    Book temp = polka[i];
                    polka[i] = polka[j];
                    polka[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        polka[0] = new Book("Al", "war1", 10, "1");
        polka[1] = new Book("Lev", "war2", 11, "2");
        polka[2] = new Book("Oleg", "war3", 12, "3");
        polka[3] = new Book("Ivan", "war4", 13, "4");
        polka[4] = new Book("Andr", "war5", 14, "5");

        System.out.println(Arrays.toString(polka));
        ssort();
        System.out.println(Arrays.toString(polka));

    }
}
