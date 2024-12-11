package ru.mirea.practice.s0000001;

class Pupil {
    int identifier;
    String nickname;
    double score;

    public Pupil(int identifier, String nickname, double score) {
        this.identifier = identifier;
        this.nickname = nickname;
        this.score = score;
    }

    public int getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "Pupil{"
                + "identifier=" + identifier
                + ", nickname='" + nickname + '\''
                + ", score=" + score
                + '}';
    }
}
