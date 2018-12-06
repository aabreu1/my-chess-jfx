package ChessApp.Model;


import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.awt.*;
import java.io.Serializable;
import java.util.Comparator;

import static java.util.Comparator.comparing;

/**
 * Clase de cuadros del tablero
 */
public class Square implements Serializable{

    public static Comparator<Square> BY_CARDINAL = comparing(Square::getCardinal);

    private String  number;
    private String  character;
    @NotNull
    private String  cardinal;
    @Nullable
    private Color   color;
    @Nullable
    private Piece   piecePlaced;

    public String getNumber() {
        return number;
    }

    protected void setNumber(String number) {
        this.number = number;
    }

    public String getCaracter() {
        return character;
    }

    private void setCaracter(String character) {
        this.character = character;
    }

    public String getCardinal() {
        return cardinal;
    }

    private void setCardinal(String cardinal) {
        this.cardinal = cardinal;
    }

    public Color getColor() {
        return color;
    }

    private void setColor(Color color) {
        this.color = color;
    }

    public Piece getPiecePlaced() {
        return piecePlaced;
    }

    public void setPiecePlaced(Piece piecePlaced) {
        this.piecePlaced = piecePlaced;
    }

    public Square (String character, String number){
        this.number     = number;
        this.character  = character;
        this.cardinal   = character+number;
    }

    /**
     * Indica si esta instancia de cuadro esta ocupada por una pieza
     * @return TRUE si esta esta ocupada
     */
    public boolean isOccupated() {
        return this.piecePlaced!=null;
    }

    public String occupatedBy() { return this.piecePlaced!=null ? piecePlaced.getName() : "Empty"; }
    public String playInfo() { return this.cardinal+"["+occupatedBy()+"]";}

    @Override
    public String toString() {
        return playInfo();
    }
}
