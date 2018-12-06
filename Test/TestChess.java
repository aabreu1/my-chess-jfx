import ChessApp.Builder.PieceFactory;
import ChessApp.Builder.SquareFactory;
import ChessApp.Model.Board;
import ChessApp.Model.Piece;
import ChessApp.Model.Square;
import org.junit.Test;

import java.util.List;
import java.util.Map;


public class TestChess {
    @Test
    public void Creation(){
        Board board = new Board();
        List<Piece> piecesSet = PieceFactory.BuildUpGameSetPieces();
        int pieceIndex = 0;

        String rows = "ABCDEFGH";
        for (int column = 1; column <= 8; column ++){
            for (int row = 0; row < rows.length(); row ++) {
                if(pieceIndex<piecesSet.size()) {
                    board.getSquares().get(String.valueOf(rows.charAt(row)) + column).setPiecePlaced(piecesSet.get(pieceIndex));
                    pieceIndex++;
                }
            }
        }
        System.out.println(board.getSquares());
    }
}
