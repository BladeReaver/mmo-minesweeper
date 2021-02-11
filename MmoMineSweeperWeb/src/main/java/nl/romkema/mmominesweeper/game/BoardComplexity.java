package nl.romkema.mmominesweeper.game;

public enum BoardComplexity {
    EASY(2),
    MEDIUM(4),
    HARD(7);

    private final int numberOfBombsPerTenFields;

    BoardComplexity(int numberOfBombsPerTenFields) {
        this.numberOfBombsPerTenFields = numberOfBombsPerTenFields;
    }

    public int getBombsPerTenFields() {
        return this.numberOfBombsPerTenFields;
    }
}
