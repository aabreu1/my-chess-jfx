package chessapp.model;

import chessapp.Abstrac.Side;
import chessapp.Type.PieceType;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

import static chessapp.controll.GameController.BUNDLE_IMG;

/**
 * Instacia de pieza en la partida
 */
public class Piece extends ImageView implements Serializable, Initializable {

    private String        name;
    private Character     notation;
    private PieceType     pieceType;
    private Side          side;
    private int           score;
    private String        movementPattern;
    private Set<Movement> movements;

    public Piece(PieceType pieceType, Side side, double size) {
        this.name       = pieceType.get();
        this.notation   = pieceType != PieceType.PAWN ? pieceType.get().charAt(0) : Character.MIN_VALUE;
        this.pieceType = pieceType;
        this.side       = side;
        this.setFitWidth(size);
        this.setFitHeight(size);
        setImage(this.pieceType, this.side);
    }


    public String getName(){
        return this.name;
    }
    public PieceType getPieceType(){
        return this.pieceType;
    }
    public Side getSide(){ return this.side; }
    public int getScore(){
        return this.score;
    }
    public Set<Movement> getMovements() {
        return movements;
    }
    public String getMovementPattern() { return this.movementPattern; }

    public void setImage(PieceType piece, Side side) {
        try {
            String imgPath = System.getProperty("user.dir")+BUNDLE_IMG.getString(getPieceType()+getName());
            File file = new File(imgPath);
            Image image = new Image(file.toURI().toString());
            this.setImage(image);
        }catch (IllegalArgumentException | NullPointerException e){
            //e.printStackTrace();
            System.err.println(e);
        }
    }

    @Override
    public String toString() {
        return "["+this.notation+"] "+this.side+"-"+this.name;
    }

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //implementacion obligatoria por la interface
    }


}
