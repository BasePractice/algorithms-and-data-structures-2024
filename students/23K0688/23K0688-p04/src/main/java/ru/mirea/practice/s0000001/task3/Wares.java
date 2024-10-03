package ru.mirea.practice.s0000001.task3;

public enum Wares {
    SALT(1) {
        @Override
        public String toString() {
            return "salt";
        }
    },
    PEPPER(2) {
        @Override
        public String toString() {
            return "pepper";
        }
    },
    CINNAMON(3) {
        @Override
        public String toString() {
            return "cinnamon";
        }
    },
    CUCUMBER(4) {
        @Override
        public String toString() {
            return "cucumber";
        }
    },
    POTATO(5) {
        @Override
        public String toString() {
            return "potato";
        }
    },
    TOMATO(6) {
        @Override
        public String toString() {
            return "tomato";
        }
    },
    APPLE(7) {
        @Override
        public String toString() {
            return "apple";
        }
    },
    PEAR(8) {
        @Override
        public String toString() {
            return "pear";
        }
    },
    PLUM(9) {
        @Override
        public String toString() {
            return "plum";
        }
    };

    private int price;

    Wares(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}
