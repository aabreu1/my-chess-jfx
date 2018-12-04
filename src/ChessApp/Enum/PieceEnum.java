package ChessApp.Enum;

public enum PieceEnum {
    KING(0), QUEEN(10), ROCK(5), KNIGHT(3), BISHOP(3), PAWN(1);

    private final int SCORE;

    private PieceEnum(int _score) {
        this.SCORE = _score;
    }

    public int score() {
        return this.SCORE;
    }
}
