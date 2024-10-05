package ru.mirea.practice.s23L0908.pw4.task2;

public enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "It's child size";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "It's adult size";
    }
}
