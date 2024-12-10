package mirea.lab13;

public abstract class Prac13p5 {
    public static String phoneFormat(String p) {
        if (p.startsWith("8")) {
            p = p.replaceFirst("8", "+7");
        }
        if (p.startsWith("+")) {
            return p.substring(0, 2) + " " + p.substring(2, 5) + "-" + p.substring(5, 8) + "-" + p.substring(8);
        } else {
            return " ";
        }
    }

    public static void main(String[] args) {
        System.out.println(phoneFormat("+71346644453"));
        System.out.println(phoneFormat("89653050013"));
    }
}
