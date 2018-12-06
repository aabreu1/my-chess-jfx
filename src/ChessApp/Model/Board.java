package ChessApp.Model;

import ChessApp.Builder.SquareFactory;

import java.util.Map;

public class Board {
    static Map<String,Square> squares;

    public Board() {
        squares = SquareFactory.BuildUpSqueres();
    }

    public static Map<String, Square> getSquares() {
        return squares;
    }
}
