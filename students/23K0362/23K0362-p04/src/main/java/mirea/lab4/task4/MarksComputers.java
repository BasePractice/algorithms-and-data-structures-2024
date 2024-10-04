package mirea.lab9.task4;

public enum MarksComputers {
    SAMSUNG(0),
    ARDORGAMING(1),
    ALIENPC(2),
    IBM(3);

    private int levelCode;

    MarksComputers(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public String getName() {
        return MarksComputers.values()[levelCode].toString();
    }
}
