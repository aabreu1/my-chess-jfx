package ChessApp.Model;

import java.util.Queue;

public class Movement {
    Queue<Square> movimiento = null;

    public Movement(Piece piece) {
        piece.getMovementPattern();
    }
}
