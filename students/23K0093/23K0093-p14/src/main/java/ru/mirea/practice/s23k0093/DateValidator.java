package ru.mirea.practice.s23k0093;

public abstract class DateValidator {
    public static void main(String[] args) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}$";

        String[] dates = {
            "29/02/2000", // правильная
            "30/04/2003", // правильная
            "01/01/2003", // правильная
            "29/02/2001", // неправильная
            "30-04-2003", // неправильная
            "1/1/1899"    // неправильная
        };

        for (String date : dates) {
            if (date.matches(regex)) {
                System.out.println(date + " -> Верная дата");
            } else {
                System.out.println(date + " -> Неверная дата");
            }
        }
    }
}
