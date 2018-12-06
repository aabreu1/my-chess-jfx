package ChessApp.Builder;

import ChessApp.Model.Square;

import java.util.SortedSet;
import java.util.TreeSet;

public class SquareFactory {

    public static SortedSet<Square> BuildUpSqueres(){
        SortedSet<Square> squares = new TreeSet<>(Square.BY_CARDINAL);
        String rows = "ABCDEFGH";
        for (int column = 1; column <= 8; column ++){
            for (int row = 0; row < rows.length(); row ++){
                String character    = String.valueOf(rows.charAt(row));
                String number       = String.valueOf(column);
                squares.add(new Square(character, number));
            }
        }
        return squares;
    }

}
