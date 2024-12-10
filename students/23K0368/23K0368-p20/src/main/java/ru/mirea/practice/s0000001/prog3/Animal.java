package ru.mirea.practice.s0000001.prog3;

public class Animal {
    private String species;

    public Animal() {
        this.species = "Unknown";
    }

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{species='" + species + "'}";
    }
}
