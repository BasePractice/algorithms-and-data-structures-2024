package ru.mirea.practice.s230k754.lab8;

public final class Task4 {
    private Task4() {}

    public static int checksum(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + checksum(n / 10);
        }
    }

    public static int function(int k, int sum) {
        var strstart = new StringBuilder();
        strstart.append("1");
        var strend = new StringBuilder();

        for (int i = 0; i < k; i++) {
            strend.append('9');
            strstart.append("0");
        }
        strstart.deleteCharAt(strstart.length() - 1);

        int nstart = Integer.parseInt(strstart.toString());
        int nend = Integer.parseInt(strend.toString());

        int counter = 0;
        while (nstart < nend) {
            if (checksum(nstart) == sum) {
                counter++;
            }
            nstart++;
        }

        return counter;
    }

    public static void main(String[] arg) {
        int k = 2;
        int s = 3;

        System.out.println(function(k, s));
    }
}
