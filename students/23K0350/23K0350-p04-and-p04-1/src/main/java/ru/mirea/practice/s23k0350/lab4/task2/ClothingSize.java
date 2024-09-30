package ru.mirea.practice.s23k0350.lab4.task2;


public enum ClothingSize {
    XXS(32, "Детский размер"),
    XS(34, "Взрослый размер"),
    S(36, "Взрослый размер"),
    M(38, "Взрослый размер"),
    L(40, "Взрослый размер");

    private final int euroSize;
    private final String description;

    ClothingSize(int euroSize, String description) {
        this.euroSize = euroSize;
        this.description = description;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return description;
    }
}
