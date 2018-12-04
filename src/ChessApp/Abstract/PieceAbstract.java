package ChessApp.Abstract;

import ChessApp.Enum.PieceEnum;
import ChessApp.Enum.Side;
import ChessApp.Interface.Piece;
import ChessApp.Model.Movement;
import java.util.Set;


public abstract class PieceAbstract implements Piece {

    public String getName(){
        return this.name;
    }
    public PieceEnum getPiece(){
        return this.piece;
    }

    public Side getSide(){
        return this.side;
    }
    public int getScore(){
        return this.piece.score();
    }

    public Set<Movement> getMovements() {
        return movements;
    }
}
