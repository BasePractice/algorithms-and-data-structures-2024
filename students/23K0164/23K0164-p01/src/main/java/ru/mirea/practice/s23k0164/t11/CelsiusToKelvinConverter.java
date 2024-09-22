package ru.mirea.practice.s23k0164.t11;

public class CelsiusToKelvinConverter implements Convertable{
    @Override
    public double convert(double celsius){
        return celsius + 273.75;
    }
}
