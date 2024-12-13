package ru.mirea.practice.s23k0755.task1;

public class ChairFactory implements AbstractChairFactory {

    @Override
    public FunctinalChair createFunctinalChair() {
        System.out.println("Create FunctinalChair.");
        return new FunctinalChair() {
            @Override
            public void sit() { //nothing to clean up
            }
        };
    }

    public MagicChair createMagicChair() {
        System.out.println("Create MagicChair.");
        return new MagicChair() {
            @Override
            public void sit() { //nothing to clean up
            }
        };
    }

    public VictorianChair createVictorianChair() {
        System.out.println("Create VictorianChair.");
        return new VictorianChair() {
            @Override
            public void sit() { //nothing to clean up
            }
        };
    }

}
