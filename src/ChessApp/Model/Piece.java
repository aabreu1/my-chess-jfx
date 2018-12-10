package ChessApp.Model;

import ChessApp.Abstrac.Side;
import ChessApp.Main;
import ChessApp.Type.PieceType;

import java.io.Serializable;
import java.util.Set;

/**
 * Instacia de pieza en la partida
 */
public class Piece implements Serializable{

    private String        name;
    private Character     notation;
    private PieceType     piece;
    private Side side;
    private int           score;
    private String        movementPattern;
    private Set<Movement> movements;

    public Piece(PieceType pieceType, Side side){
        this.name       = pieceType.get();
        this.notation   = pieceType != PieceType.PAWN ? pieceType.get().charAt(0) : Character.MIN_VALUE;
        this.piece      = pieceType;
        this.side       = side;
        //this.score    = Integer.parseInt(Main.BUNDLE_SCORE.getString(pieceType.get()));
      //  this.movementPattern = Main.BUNDLE_PATTERN.getString(piece.get());
    }


    public String getName(){
        return this.name;
    }
    public PieceType getPiece(){
        return this.piece;
    }
    public Side getSide(){ return this.side; }
    public int getScore(){
        return this.score;
    }
    public Set<Movement> getMovements() {
        return movements;
    }
    public String getMovementPattern() { return this.movementPattern; }

    @Override
    public String toString() {
        return "["+this.notation+"] "+this.side+"-"+this.name;
    }
}
