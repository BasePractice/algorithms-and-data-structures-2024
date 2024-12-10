package mirea.lab21.p2;

import java.util.Arrays;

public abstract class Prac21p2 {
    public static void main(String[] args) {
        String[] s = {"abc","def","aaaaaaa"};
        System.out.println(Arrays.toString(s));
        Anyarr<String> arr = new Anyarr<String>(s);
        arr.setElement(1,"changed");
        System.out.println(arr.toString());
    }
}
