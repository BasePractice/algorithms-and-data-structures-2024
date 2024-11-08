package ru.mirea.practice.s23k0155.task5;

public class  ChangeNumber {
    private String number;

    public ChangeNumber(String string) {
        if (string.length() == 11) {
            this.number = "+7 " + string.substring(1, 4) + " - "
                    + string.substring(4, 7) + " - "
                    + string.substring(7, 11);
        } else if (string.length() == 12) {
            this.number = string.substring(0, 2) + " "
                    + string.substring(2, 5) + " - "
                    + string.substring(5, 8) + " - "
                    + string.substring(8, 12);
        } else {
            this.number = string.substring(0, 3) + " "
                    + string.substring(3, 6) + " - "
                    + string.substring(6, 9) + " - "
                    + string.substring(9, 13);
        }
    }

    public String toSTring() {
        return number;
    }

}
