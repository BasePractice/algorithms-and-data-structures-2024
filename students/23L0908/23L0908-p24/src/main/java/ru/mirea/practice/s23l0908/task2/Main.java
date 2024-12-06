package ru.mirea.practice.s23l0908.task2;

public final class Main {

    private Main() {
    }

    @SuppressWarnings("unused")
    public interface AbstractChairFactory {
        VictorianChair createVictorianChair();

        MagicChair createMagicChair();

        FunctionalChair createFunctionalChair();

    }

    public static class Chair {
    }

    public static class VictorianChair extends Chair {
        private final int age;

        public VictorianChair(int age) {
            this.age = age;
        }

        @SuppressWarnings("unused")
        public int getAge() {
            return age;
        }

    }

    public static class MagicChair extends Chair {
        @SuppressWarnings("unused")
        void doMagic() {

            System.out.println("Magic!!");
        }
    }

    public static class FunctionalChair extends Chair {
        @SuppressWarnings("unused")
        public int sum(int a, int b) {
            return a + b;
        }
    }

    public static class ChairFactory implements AbstractChairFactory {

        @Override
        public VictorianChair createVictorianChair() {
            return new VictorianChair(20);
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

    public static class Client {
        Chair chair;

        public void sit() {
            System.out.println("Sitting on " + chair.getClass().getSimpleName());
        }

        public void setChair(Chair chair) {
            this.chair = chair;
        }
    }

    public static void main(String[] args) {
        Chair chair1 = new ChairFactory().createVictorianChair();
        Chair chair2 = new ChairFactory().createMagicChair();
        Chair chair3 = new ChairFactory().createFunctionalChair();
        Client client = new Client();
        client.setChair(chair1);
        client.sit();
        client.setChair(chair2);
        client.sit();
        client.setChair(chair3);
        client.sit();
    }
}
