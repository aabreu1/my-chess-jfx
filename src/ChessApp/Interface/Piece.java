package ChessApp.Interface;

import ChessApp.Enum.PieceEnum;
import ChessApp.Enum.SideType;
import ChessApp.Model.Movement;

import java.util.Set;

public interface Piece {

    String           getName();
    PieceEnum        getPiece();
    SideType getSide();
    int              getScore();
    String           getMovementPattern();
    Set<Movement>    getMovements();



}
