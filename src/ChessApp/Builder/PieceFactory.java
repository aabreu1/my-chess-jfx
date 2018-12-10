package ChessApp.Builder;

import ChessApp.Abstrac.Side;
import ChessApp.Model.BoardController;
import ChessApp.Model.Piece;
import ChessApp.Type.PieceType;
import ChessApp.implementation.BlackSide;
import ChessApp.implementation.WhiteSide;

import java.util.ArrayList;
import java.util.List;

public class PieceFactory {

    public static List<Piece> BuildUpSetPieces(BoardController board){
        List<Piece> pieces = new ArrayList<>();
        for (PieceType piece : PieceType.values()) {
                    pieces.add(create(piece, BlackSide.instance()));
                    pieces.add(create(piece, WhiteSide.instance()));
            }
        return pieces;
    }

    public static Piece create(PieceType pieceType, Side side){
        return new Piece(pieceType, side);
    }
}
