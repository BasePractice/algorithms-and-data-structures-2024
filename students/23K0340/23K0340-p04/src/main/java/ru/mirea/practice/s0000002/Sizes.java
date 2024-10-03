package ru.mirea.practice.s0000002;

public enum Sizes {
    XXS(32,"Детский"),
    XS(34,"Взрослый"),
    S(36,"Взрослый"),
    M(38,"Взрослый"),
    L(40,"Взрослый")
    ;
    private final String size;
    private final int eurosize;

    Sizes(int eurosize,String size) {
        this.size = size;
        this.eurosize = eurosize;
    }

    public String getDescription() {
        return size + " размер";
    }

    public int getEuroSize() {
        return eurosize;
    }
}