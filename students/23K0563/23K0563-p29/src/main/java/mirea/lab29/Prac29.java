package mirea.lab29;

import java.util.Scanner;

public abstract class Prac29 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int rc = 0;
            for (int i = 0; i <= n; i++) {
                String[] col = sc.nextLine().split(" ");
                for (String x : col) {
                    if ("1".equals(x)) {
                        rc++;
                    }
                }
            }
            System.out.println(rc / 2);
        }
    }
}
