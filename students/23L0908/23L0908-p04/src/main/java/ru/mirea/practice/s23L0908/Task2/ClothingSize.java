package ru.mirea.practice.s23L0908.Task2;


enum ClothingSize {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        String sizeDescription;
        switch (this) {
            case XXS:
                sizeDescription = "children size";
                break;
            default:
                sizeDescription = "adult size";
                break;
        }
        return sizeDescription;
    }
}
