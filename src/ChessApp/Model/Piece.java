package ChessApp.Model;

import ChessApp.Abstract.PieceAbstract;
import ChessApp.Enum.SideType;

import java.io.Serializable;

/**
 * Instacia de pieza en la partida
 */
public class Piece extends PieceAbstract implements Serializable {

    public Piece(String name, Piece piece, Side side) {
        super(name, piece, side);
    }

    @Override
    public String getMovementPattern() {
        return this.movementPattern;
    }
}
