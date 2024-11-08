package mirea.lab14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

/* Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU */

public abstract class Prac14p3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Pattern p = Pattern.compile("(\\d+\\.\\d\\d ((USD)|(RUB)|(EU)))");
            System.out.print("Введите строку: ");
            String inp = sc.nextLine();
            Matcher m = p.matcher(inp);
            if (m.find()) {
                System.out.println(m.group(1));
            }
        }
    }
}
