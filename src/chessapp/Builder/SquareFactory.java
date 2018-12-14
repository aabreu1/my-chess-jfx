package chessapp.Builder;

import chessapp.model.Square;

import java.util.HashMap;
import java.util.Map;


public class SquareFactory {
    public static String COLUMNS = "ABCDEFGH";
    public static String COLUMNS_INVERT = "HGFEDCBA";

    public static Map<String,Square> BuildUpSqueres(){
        Map<String,Square> squares = new HashMap<String,Square>();
        boolean color = true;
        for (int row = 1; row <= 8; row ++){
            for (int column = 0; column < COLUMNS.length(); column ++){
                String character    = String.valueOf(COLUMNS.charAt(column));
                String number       = String.valueOf(row);
                Square square = new Square(character, number);
                square.setStyle("-fx-background-color:"+(color ? "white" : "black"));
                color = !color;
                squares.put(square.getCardinal(), square);
            }
            color = !color;
        }
        return squares;
    }

}
