package chessapp.model;


import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import java.awt.Color;
import java.io.Serializable;

/**
 * Clase de cuadros del tablero
 */
public class Square extends StackPane implements Serializable{

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
        if(this.piecePlaced == null ){
            this.piecePlaced = piecePlaced;
            this.getChildren().add(this.piecePlaced);
        }
        else if( this.piecePlaced != null && this.piecePlaced.getPieceType() != piecePlaced.getPieceType()){
            this.getChildren().clear();
            this.piecePlaced = piecePlaced;
            this.getChildren().add(this.piecePlaced);
        }
    }

    public Square (String character, String number){
        super();
        this.number     = number;
        this.character  = character;
        this.cardinal   = character+number;
        this.setAlignment(Pos.CENTER);
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
