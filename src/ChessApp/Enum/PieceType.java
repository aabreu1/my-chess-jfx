package ChessApp.Enum;

/**
 * estandar de piezas disponible
 */
public enum PieceType {
    KING("KING"),
    QUEEN("QUEEN"),
    ROCK("ROCK"),
    KNIGHT("KNIGHT"),
    BISHOP("BISHOP"),
    PAWN("PAWN");

    private final String CODE;

    private PieceType(String CODE) {
        this.CODE = CODE;
    }
    public String get() {
        return this.CODE;
    }
}
