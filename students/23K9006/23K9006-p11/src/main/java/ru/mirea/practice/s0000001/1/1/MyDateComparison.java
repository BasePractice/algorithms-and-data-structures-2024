package ru.mirea.practice.s0000001;

import java.text.ParseException;
import java.text.SimpleDateFormat;

class MyDateComparison extends DateComparison {

    @Override
    public void setUserDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        try {
            this.userDate = dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Ошибка при вводе даты. Пожалуйста, используйте формат: dd-MM-yyyy HH:mm:ss");
        }
    }
}
