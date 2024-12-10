package mirea.lab25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Prac25p1 {
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
