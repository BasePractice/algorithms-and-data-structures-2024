package ru.mirea.practice.s0000001.task3;

public enum Catalogue {
    SPICES(Wares.SALT,Wares.PEPPER,Wares.CINNAMON) {
        @Override
        public String toString() {
            return "Spices";
        }
    },
    VEGETABLES(Wares.CUCUMBER,Wares.POTATO,Wares.TOMATO) {
        @Override
        public String toString() {
            return "Vegetables";
        }
    },
    FRUITS(Wares.APPLE,Wares.PEAR,Wares.PLUM) {
        @Override
        public String toString() {
            return "Fruits";
        }
    };

    private Wares w1;
    private Wares w2;
    private Wares w3;

    Catalogue(Wares w1,Wares w2,Wares w3) {
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
    }

    void getWares() {
        System.out.println(w1 + "," + w2 + "," + w3);
    }
}
