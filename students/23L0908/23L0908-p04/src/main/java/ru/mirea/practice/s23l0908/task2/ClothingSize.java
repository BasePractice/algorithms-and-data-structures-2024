package ru.mirea.practice.s23l0908.task2;


enum ClothingSize {
    XXS(32),
    @SuppressWarnings("unused")
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    @SuppressWarnings("unused")
    public int getEuroSize() {
        return euroSize;
    }

    @SuppressWarnings("unused")
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
