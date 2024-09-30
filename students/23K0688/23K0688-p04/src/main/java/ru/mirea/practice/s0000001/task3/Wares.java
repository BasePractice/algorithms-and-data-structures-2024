package ru.mirea.practice.s0000001.task3;

public enum Wares {
    salt(1) {
        @Override
        public String toString() {
            return "salt";
        }
    },
    pepper(2) {
        @Override
        public String toString() {
            return "pepper";
        }
    },
    cinnamon(3) {
        @Override
        public String toString() {
            return "cinnamon";
        }
    },
    cucumber(4) {
        @Override
        public String toString() {
            return "cucumber";
        }
    },
    potato(5) {
        @Override
        public String toString() {
            return "potato";
        }
    },
    tomato(6) {
        @Override
        public String toString() {
            return "tomato";
        }
    },
    apple(7) {
        @Override
        public String toString() {
            return "apple";
        }
    },
    pear(8) {
        @Override
        public String toString() {
            return "pear";
        }
    },
    plum(9) {
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
