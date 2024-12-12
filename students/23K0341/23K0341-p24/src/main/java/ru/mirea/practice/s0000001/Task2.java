package ru.mirea.practice.s0000001;

/**
 * Реализовать класс Абстрактная фабрика для различных типов
 * стульев: Викторианский стул, Многофункциональный стул, Магический
 * стул, а также интерфейс Стул, от которого наследуются все классы стульев,
 * и класс Клиент, который использует интерфейс стул в своем методе Sit
 * (Chair chair).
 */

public abstract class Task2 {
    public static void main(String[] args) {
        Client client = new Client();
        client.setChair(new AbstracFactory().createMagicChair());
        client.sit();
    }

    static class Client {
        Chair chair;

        void sit() {
            chair.sit();
        }

        public void setChair(Chair chair) {
            this.chair = chair;
        }
    }

    interface Chair {
        void sit();
    }

    static class VictorianChair implements Chair {
        int age;

        @Override
        public void sit() {
            System.out.println("Джентельмены присаживайтесь.");
        }

        public int getAge() {
            return age;
        }

        void victorianAge(int age) {
            this.age = age;
        }
    }

    static class MagicChair implements Chair {
        void doMagic() {
            System.out.println("Стул признал в вас мага, но всё равно не позволит сидеть на нём.");
        }

        @Override
        public void sit() {
            System.out.println("Стул пытается от меня сбежать.");
        }
    }

    static class FunctionalChair implements Chair {
        int sum(int a, int b) {
            return a + b;
        }

        @Override
        public void sit() {
            System.out.println("Чтобы на мне сидеть реши задачку.");
        }
    }

    interface AbstracChairFactory {
        VictorianChair createVictorianChair();

        MagicChair createMagicChair();

        FunctionalChair createFunctionalChair();
    }

    static class AbstracFactory implements AbstracChairFactory {
        @Override
        public VictorianChair createVictorianChair() {
            return new VictorianChair();
        }

        @Override
        public MagicChair createMagicChair() {
            return new MagicChair();
        }

        @Override
        public FunctionalChair createFunctionalChair() {
            return new FunctionalChair();
        }
    }
}
