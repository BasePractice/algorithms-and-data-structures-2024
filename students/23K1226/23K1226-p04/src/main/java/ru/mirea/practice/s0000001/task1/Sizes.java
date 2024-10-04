package ru.mirea.practice.s0000001.task1;

enum Sizes {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    private final int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

    public int getEuroSize() {
        return euroSize;
    }
}
