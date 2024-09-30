package ru.mirea.practice.s230k754.lab5.task1;

public class Score {
    private int scoreMilan;
    private int scoreReal;
    private String lastScore;
    private String winner;

    public Score() {
        this.scoreMilan = 0;
        this.scoreReal = 0;
        this.lastScore = "N/A";
        this.winner = "Winner: DRAW";
    }

    public int getScoreMilan() {
        return scoreMilan;
    }

    public int getScoreReal() {
        return scoreReal;
    }

    public void setScoreMilan() {
        lastScore = "Last Scorer: Milan";
        this.scoreMilan += 1;
        setWinner();
    }

    public void setScoreReal() {
        lastScore = "Last Scorer: Real";
        this.scoreReal += 1;
        setWinner();
    }

    public String getLastScore() {
        return lastScore;
    }

    private void setWinner() {
        if (scoreMilan > scoreReal) {
            winner = "Winner: Milan";
        } else if (scoreMilan < scoreReal) {
            winner = "Winner: Real";
        } else {
            this.winner = "Winner: DRAW";
        }
    }

    public String getWinner() {
        return winner;
    }
}
