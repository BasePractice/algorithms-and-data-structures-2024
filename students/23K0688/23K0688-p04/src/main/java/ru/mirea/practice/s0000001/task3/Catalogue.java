package ru.mirea.practice.s0000001.task3;

public enum Catalogue {
    Spices(Wares.salt,Wares.pepper,Wares.cinnamon) {
        @Override
        public String toString() {
            return "Spices";
        }
    },
    Vegetables(Wares.cucumber,Wares.potato,Wares.tomato) {
        @Override
        public String toString() {
            return "Vegetables";
        }
    },
    Fruits(Wares.apple,Wares.pear,Wares.plum) {
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
