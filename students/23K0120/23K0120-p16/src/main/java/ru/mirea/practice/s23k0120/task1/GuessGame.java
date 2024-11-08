package ru.mirea.practice.s23k0120.task1;

import java.util.Random;

public class GuessGame {
    private GuessState stateOfGuess;

    private GameState stateOfGame;
    private int tries;
    private final int minNum;
    private final int maxNum;
    private int numToGuess;

    public GuessGame(int minNum, int maxNum, int tries) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.tries = tries;
        initGame();
    }

    public int getTries() {
        return tries;
    }

    public GuessState getStateOfGuess() {
        return stateOfGuess;
    }

    public GameState getStateOfGame() {
        return stateOfGame;
    }

    private void initGame() {
        numToGuess = new Random().nextInt(maxNum - minNum) + minNum;
        this.stateOfGame = GameState.INPROGRESS;
        this.stateOfGuess = GuessState.INCORRECT;
    }

    public int getMinNum() {
        return minNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public int getNumToGuess() {
        return numToGuess;
    }

    public void setIncorrect() {
        stateOfGuess = GuessState.INCORRECT;
    }

    public void guess(int num) {
        stateOfGuess = GuessState.INCORRECT;
        if (num > numToGuess) {
            stateOfGuess = GuessState.GREATER;
        } else if (num < numToGuess) {
            stateOfGuess = GuessState.SMALLER;
        } else if (num == numToGuess) {
            stateOfGuess = GuessState.EQUALS;
        }

        if (stateOfGuess != GuessState.EQUALS) {
            tries -= 1;
        } else {
            stateOfGame = GameState.WIN;
        }
        if (tries <= 0) {
            stateOfGame = GameState.LOSE;
        }
    }

    public enum GuessState {
        SMALLER, GREATER, EQUALS, INCORRECT
    }

    public enum GameState {
        WIN, LOSE, INPROGRESS
    }
}
