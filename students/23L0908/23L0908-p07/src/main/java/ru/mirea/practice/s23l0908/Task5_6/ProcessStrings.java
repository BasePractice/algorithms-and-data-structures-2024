package ru.mirea.practice.s23l0908.Task5_6;

public class ProcessStrings {
    String str;

    ProcessStrings(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public int length() {
        int length = 0;
        String tmp = "";
        for (int i = 0; !this.str.equals(tmp); i++) {
            length++;
            tmp += this.str.charAt(i);
        }

        return length;
    }

    public String strOdd() {
        int len = this.length();
        String tmp = "";
        for (int i = 0; i < len; i++) {
            if (i % 2 != 0)
                tmp += this.str.charAt(i);
        }
        return tmp;
    }

    public void reserveString() {
        int len = this.length();
        String tmp = "";
        for (int i = 0; i < len; i++)
            tmp = this.str.charAt(i) + tmp;
        this.str = tmp;
    }
}
