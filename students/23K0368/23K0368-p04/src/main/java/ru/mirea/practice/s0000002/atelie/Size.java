package ru.mirea.practice.s0000002.atelie;

enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);

    private final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        if (this == XXS) {
            return "Детский размер";
        } else {
            return "Взрослый размер";
        }
    }

    public int getEuroSize() {
        return euroSize;
    }
}
