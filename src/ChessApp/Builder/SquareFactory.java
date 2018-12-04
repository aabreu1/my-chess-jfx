package ChessApp.Builder;

import ChessApp.Model.Square;

import java.util.HashSet;
import java.util.Set;

public class SquareFactory {

    public Set<Square> BuildSqueres(){
        Set<Square> squares = new HashSet<>();
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
