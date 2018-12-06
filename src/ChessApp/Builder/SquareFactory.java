package ChessApp.Builder;

import ChessApp.Model.Square;

import java.util.HashMap;
import java.util.Map;


public class SquareFactory {

    public static Map<String,Square> BuildUpSqueres(){
        Map<String,Square> squares = new HashMap<String,Square>();
        String rows = "ABCDEFGH";
        for (int column = 1; column <= 8; column ++){
            for (int row = 0; row < rows.length(); row ++){
                String character    = String.valueOf(rows.charAt(row));
                String number       = String.valueOf(column);
                squares.put(character+number,new Square(character, number));
            }
        }
        return squares;
    }

}
