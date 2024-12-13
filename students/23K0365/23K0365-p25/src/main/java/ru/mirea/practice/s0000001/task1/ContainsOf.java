package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;

public abstract class ContainsOf {
    public static void main(String[] args) {
        String[] texts = {
            "qwer qwer qwer",
            "12 qw 5rr12 grkn;vbklrn",
            "i love my family",
            "bless you"};
        //или:
        //try (Scanner sc = new Scanner(System.in)) {
        //int cnt = sc.nextInt();
        //String[] text = new String[cnt];
        //for (int i = 0; i < cnt; i++) {
        //text[i] = sc.nextLine();
        //}
        //}
        String regex = "\\s+";
        for (String x : texts) {
            System.out.println(Arrays.toString(x.split(regex)));
        }
    }
}
