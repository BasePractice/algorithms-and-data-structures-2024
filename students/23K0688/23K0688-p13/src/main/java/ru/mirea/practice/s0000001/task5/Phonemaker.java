package ru.mirea.practice.s0000001.task5;

public class Phonemaker {
    public String randomcountry(String num) {
        StringBuilder returnee = new StringBuilder();
        for (int i = 0;i < num.length();i++) {
            returnee.append(num.charAt(i));
            if (i == 4 || i == 7) {
                returnee.append("-");
            }
        }
        return returnee.toString();
    }

    public String ruscountry(String num) {
        StringBuilder returnee = new StringBuilder();
        returnee.append("+");
        for (int i = 0;i < num.length();i++) {
            returnee.append(num.charAt(i));
            if (i == 3 || i == 6) {
                returnee.append("-");
            }
        }
        return returnee.toString();
    }
}
