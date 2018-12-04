package ChessApp.Model;

import ChessApp.Abstract.PieceAbstract;
import java.io.Serializable;

public class Piece extends PieceAbstract implements Serializable {


    @Override
    public String getMovementPattern() {
        return this.movementPattern;
    }
}
