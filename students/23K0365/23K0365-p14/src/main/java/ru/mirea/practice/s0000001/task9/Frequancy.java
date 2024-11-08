package ru.mirea.practice.s0000001.task9;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public abstract class Frequancy {
    public static void main(String[] args) {
        String text = "O wall, O sweet and lovely wall,\n"
            + "Show me thy chink to blink through with mine eyne!\n"
            + "Thanks, courteous wall. Jove shield thee well for this.\n"
            + "But what see I? No Thisby do I see.\n"
            + "O wicked wall, through whom I see no bliss!\n"
            + "Cursed be thy stones for thus deceiving me!";

        Map<Character, Integer> frequency = new HashMap<>();
        for (char ch : text.toLowerCase(Locale.ENGLISH).toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println("Буква '" + entry.getKey() + "' встречается " + entry.getValue() + " раз(а).");
        }
    }
}
