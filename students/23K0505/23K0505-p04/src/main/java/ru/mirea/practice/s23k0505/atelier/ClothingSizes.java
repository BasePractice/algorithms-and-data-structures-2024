package ru.mirea.practice.s23k0505.atelier;

public enum ClothingSizes {
    XXS(32), XS(34), S(36), M(38), L(40);

    final int euroSize;

    ClothingSizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        if (euroSize >= 34) {
            return "Взрослый размер";
        } else {
            return "Детский размер";
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %d", getDescription(), this.euroSize);
    }
}
