package ChessApp.Model;

import ChessApp.Abstrac.Side;
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

    public Piece(PieceType piece, Side side){
        this.name       = piece.get();
        this.notation   = piece != PieceType.PAWN ? piece.get().charAt(0) : Character.MIN_VALUE;
        this.piece      = piece;
        this.side       = side;
      //  this.score      = Integer.parseInt(Main.BUNDLE_SCORE.getString(piece.get()));
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
