package ru.mirea.practice.s23l0908.task56;

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
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (i % 2 != 0) {
                tmp.append(this.str.charAt(i));
            }
        }
        return tmp.toString();
    }


    public void reserveString() {
        int len = this.length();
        StringBuilder tmp = new StringBuilder(len);
        for (int i = len - 1; i >= 0; i--) {
            tmp.append(this.str.charAt(i));
        }
        this.str = tmp.toString();
    }
}
