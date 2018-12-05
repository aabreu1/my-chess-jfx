package ChessApp.Abstract;

import ChessApp.Enum.PieceEnum;
import ChessApp.Enum.SideType;
import ChessApp.Interface.Piece;
import ChessApp.Model.Movement;
import java.util.Set;


public abstract class PieceAbstract implements Piece {
    protected String          name;
    protected Piece         piece;
    protected SideType side;
    protected String          movementPattern;
    protected Set<Movement>   movements;

    public PieceAbstract(String name, Piece piece, SideType sideType){
        this.name  = name;
        this.piece = piece;
        this.side  = sideType;
    }

    public String getName(){
        return this.name;
    }
    public Piece getPiece(){
        return this.piece;
    }
    public SideType getSide(){
        return this.side;
    }
    public int getScore(){
        return this.piece.score();
    }
    public Set<Movement> getMovements() {
        return movements;
    }
}
