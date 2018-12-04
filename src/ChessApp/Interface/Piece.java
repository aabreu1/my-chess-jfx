package ChessApp.Interface;

import ChessApp.Enum.PieceEnum;
import ChessApp.Enum.Side;
import ChessApp.Model.Movement;

import java.util.Set;

public interface Piece {
    String          name            = null;
    PieceEnum       piece           = null;
    Side            side            = null;
    String          movementPattern = null;
    Set<Movement>   movements       = null;

    public String           getName();
    public PieceEnum        getPiece();
    public Side             getSide();
    public int              getScore();
    public String           getMovementPattern();
    public Set<Movement>    getMovements();

}
