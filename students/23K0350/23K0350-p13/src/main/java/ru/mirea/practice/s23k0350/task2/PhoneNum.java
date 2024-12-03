package ru.mirea.practice.s23k0350.task2;

public class PhoneNum {
    String number;

    public PhoneNum(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public StringBuilder normnumbuilder() {
        String code = "00";
        StringBuilder normnum = new StringBuilder();
        StringBuilder number1 = new StringBuilder(number);
        if (number1.length() == 14) {
            code = number1.substring(0,4);
            number1.delete(0,4);
        } else if (number1.length() == 13) {
            code = number1.substring(0,3);
            number1.delete(0,3);
        } else if (number1.length() == 12) {
            code = number1.substring(0, 2);
            number1.delete(0,2);
        }
        if (number.charAt(0) == '+') {
            String line1 = number1.substring(0,3);
            String line2 = number1.substring(3,6);
            String line3 = number1.substring(6,10);
            normnum.append(code).append(line1).append("-").append(line2).append("-").append(line3);
        } else {
            String line1 = number1.substring(1,4);
            String line2 = number1.substring(4,7);
            String line3 = number1.substring(7,11);
            normnum.append("+7").append(line1).append("-").append(line2).append("-").append(line3);
        }
        return normnum;
    }

    public String toString() {
        return "Изначальный номер: "
                + getNumber()
                + "\n"
                + "Нормализированный номер:"
                + normnumbuilder();
    }
}

