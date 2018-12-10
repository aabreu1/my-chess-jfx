package ChessApp.Controll;

import ChessApp.Builder.PieceFactory;
import ChessApp.Model.Board;
import ChessApp.Type.PieceType;
import ChessApp.implementation.WhiteSide;
import javafx.scene.layout.StackPane;

import java.util.ResourceBundle;

public class GameController {

    public static final ResourceBundle BUNDLE_IMG = ResourceBundle.getBundle("PieceImg");
    public static final ResourceBundle BUNDLE_PATTERN = ResourceBundle.getBundle("PiecePattern");
    public static final ResourceBundle BUNDLE_SCORE = ResourceBundle.getBundle("PieceScore");
    public static final ResourceBundle BUNDLE_STARTING_POSITION_BLACK = ResourceBundle.getBundle("StartPositionBlack");
    public static final ResourceBundle BUNDLE_STARTING_POSITION_WHITE = ResourceBundle.getBundle("StartPositionWhite");

    private Board gameBoard;

    public void BuildUpGame (){
        String[] startPositionWhite;
        String[] startPositionBlack;
        this.gameBoard = new Board();
        for (PieceType piece : PieceType.values()) {
            startPositionWhite = BUNDLE_STARTING_POSITION_WHITE.getString(piece.get()).split(",");
            startPositionBlack = BUNDLE_STARTING_POSITION_BLACK.getString(piece.get()).split(",");
            for (String coordinate : startPositionWhite){
                this.gameBoard.getSquares().get(coordinate).setPiecePlaced(PieceFactory.create(piece,WhiteSide.instance()));
                this.gameBoard.getSquares().get(coordinate).text.setText(
                        this.gameBoard.getSquares().get(coordinate).getPiecePlaced().getName()
                );
            }
            for (String coordinate : startPositionBlack){
                this.gameBoard.getSquares().get(coordinate).setPiecePlaced(PieceFactory.create(piece,WhiteSide.instance()));
                this.gameBoard.getSquares().get(coordinate).text.setText(
                        this.gameBoard.getSquares().get(coordinate).getPiecePlaced().getName()
                );
            }

        }

    }

    public StackPane getBoard(){
        return gameBoard.getBoardComponent();
    }
}
