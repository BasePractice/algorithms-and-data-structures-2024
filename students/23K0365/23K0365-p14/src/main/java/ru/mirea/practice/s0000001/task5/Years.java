package ru.mirea.practice.s0000001.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Years {
    public static void main(String[] args) {
        String[] years = {
            "29/01/2005",
            "29.01.2005",
            "29{01*2005",
            "29/02/2005",
            "29/02/2000",
            "33/14/2005",
            "29012005",
            "29-01-2005",
            "28/02/2005",
            "24/14/2005"
        };
        Pattern p1 = Pattern.compile("(\\d){2}/(\\d){2}/(\\d){4}");
        Matcher m1;
        for (String x : years) {
            m1 = p1.matcher(x);
            if (m1.find()) {
                int[] a = new int[3];
                for (int i = 0; i < 3; i++) {
                    a[i] = Integer.parseInt(x.split("/")[i]);
                }
                if (a[2] >= 1900 && a[2] <= 9999 && a[0] <= 31 && a[1] <= 12
                    && !(a[2] % 400 != 0 && a[0] > 28 && a[1] == 2))  {
                    System.out.println(x);
                }
            }
        }
    }
}

