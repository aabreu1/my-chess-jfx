package ChessApp.Model;


import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.awt.*;
import java.io.Serializable;
import java.util.Comparator;

public class Square implements Serializable {
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

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCaracter() {
        return character;
    }

    public void setCaracter(String character) {
        this.character = character;
    }

    public String getCardinal() {
        return cardinal;
    }

    public void setCardinal(String cardinal) {
        this.cardinal = cardinal;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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

    public boolean isOccupated() {
        return this.piecePlaced!=null;
    }
}
