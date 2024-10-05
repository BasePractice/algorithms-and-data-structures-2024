package ru.mirea.practice.s23L0908.prog11;

import java.util.Objects;

public class Convertation implements Convertable {
    private Double temp;

    Convertation(Double temp) {
        this.temp = temp;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @Override
    public void convert(Double temp, String sys) {
        if (Objects.equals(sys, "K")) {
            this.temp = temp + 273;
        } else if (Objects.equals(sys, "F")) {
            this.temp = temp * 9 / 5 + 32;
        }
    }

    @Override
    public String toString() {
        return "Convertation{"
                + "temp=" + temp
                + '}';
    }
}
