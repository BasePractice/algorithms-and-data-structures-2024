package ru.mirea.practice.s23k0120.task1;

import java.util.ArrayList;
import java.util.List;

public class Combinatorics {
    private static List<Integer> undirectIntegers(List<DirectedInteger> directedIntegers) {
        List<Integer> integers = new ArrayList<>();
        for (DirectedInteger directedInteger : directedIntegers) {
            integers.add(directedInteger.getValue());
        }
        return integers;
    }

    private int maxInd(List<DirectedInteger> directedIntegers) {
        int maxInd = 0;
        for (int i = 0; i < directedIntegers.size(); i++) {
            if (directedIntegers.get(i).getValue() > directedIntegers.get(maxInd).getValue()) {
                maxInd = i;
            }
        }
        return maxInd;
    }

    private int maxMobileInd(List<DirectedInteger> directedIntegers) {
        int maxInd = -1;
        int size = directedIntegers.size();
        int maxUndirInd = maxInd(directedIntegers);
        if (maxUndirInd != 0 && maxUndirInd != size - 1
            || maxUndirInd == 0 && directedIntegers.get(maxUndirInd).getDirection() == Direction.RIGHT
            || maxUndirInd == size - 1 && directedIntegers.get(maxUndirInd).getDirection() == Direction.LEFT) {
            return maxUndirInd;
        }
        for (int i = 0; i < size; i++) {
            DirectedInteger dirInt = directedIntegers.get(i);
            if (i != 0 && i != size - 1) {
                int indDirIntFacing = dirInt.getDirection() == Direction.LEFT ? i - 1 : i + 1;
                DirectedInteger dirIntFacing = directedIntegers.get(indDirIntFacing);
                if (dirInt.getValue() > dirIntFacing.getValue()) {
                    if (maxInd == -1) {
                        maxInd = i;
                    } else {
                        DirectedInteger maxDirInt = directedIntegers.get(maxInd);
                        if (dirInt.getValue() > maxDirInt.getValue()) {
                            maxInd = i;
                        }
                    }
                }
            } else if (i == size - 1 && dirInt.getDirection() == Direction.LEFT && directedIntegers.get(i - 1).getValue() < dirInt.getValue()) {
                maxInd = i;
            } else if (i == 0 && dirInt.getDirection() == Direction.RIGHT && directedIntegers.get(1).getValue() < dirInt.getValue()) {
                maxInd = i;
            }
        }
        return maxInd;
    }

    public List<List<Integer>> permutations(int n) {
        List<DirectedInteger> directedIntegers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            directedIntegers.add(new DirectedInteger(i + 1, Direction.LEFT));
        }
        List<List<Integer>> permutations = new ArrayList<>();
        permutations.add(undirectIntegers(directedIntegers));
        while (true) {
            int ind = maxMobileInd(directedIntegers);
            if (ind == -1) {
                break;
            }
            DirectedInteger maxDirInt = directedIntegers.get(ind);
            int tempInd = maxDirInt.getDirection() == Direction.LEFT ? ind - 1 : ind + 1;
            DirectedInteger tempDirInt = directedIntegers.get(tempInd);
            directedIntegers.set(ind, tempDirInt);
            directedIntegers.set(tempInd, maxDirInt);
            for (DirectedInteger directedInteger : directedIntegers) {
                if (directedInteger.getValue() > maxDirInt.getValue()) {
                    directedInteger.switchDirection();
                }
            }
            permutations.add(undirectIntegers(directedIntegers));
        }
        return permutations;
    }


    enum Direction { LEFT, RIGHT }

    private class DirectedInteger {
        private final Integer value;
        private Direction direction;

        public DirectedInteger(Integer value, Direction direction) {
            this.value = value;
            this.direction = direction;
        }

        public Integer getValue() {
            return value;
        }

        public Direction getDirection() {
            return direction;
        }

        public void setDirection(Direction direction) {
            this.direction = direction;
        }

        public void switchDirection() {
            this.direction = this.direction == Direction.LEFT ? Direction.RIGHT : Direction.LEFT;
        }

        @Override
        public String toString() {
            return direction + " " + value;
        }
    }
}
