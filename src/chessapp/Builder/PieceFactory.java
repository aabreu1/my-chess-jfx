package chessapp.Builder;

import chessapp.Abstrac.Side;
import chessapp.model.Piece;
import chessapp.Type.PieceType;
import chessapp.implementation.BlackSide;
import chessapp.implementation.WhiteSide;

import java.util.ArrayList;
import java.util.List;

public class PieceFactory {

    public static List<Piece> BuildUpSetPieces(double size){
        List<Piece> pieces = new ArrayList<>();
        for (PieceType piece : PieceType.values()) {
                    pieces.add(create(piece, BlackSide.instance(), size));
                    pieces.add(create(piece, WhiteSide.instance(), size));
            }
        return pieces;
    }

    public static Piece create(PieceType pieceType, Side side, double size){
        return new Piece(pieceType, side, size);
    }
}
