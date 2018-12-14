package chessapp.controll;

import chessapp.Builder.PieceFactory;
import chessapp.model.Board;
import chessapp.Type.PieceType;
import chessapp.implementation.BlackSide;
import chessapp.implementation.WhiteSide;
import javafx.scene.layout.StackPane;

import java.util.ResourceBundle;

public class GameController {

    public static final ResourceBundle BUNDLE_IMG = ResourceBundle.getBundle("PieceImg");
    public static final ResourceBundle BUNDLE_PATTERN = ResourceBundle.getBundle("PiecePattern");
    public static final ResourceBundle BUNDLE_SCORE = ResourceBundle.getBundle("PieceScore");
    public static final ResourceBundle BUNDLE_STARTING_POSITION_BLACK = ResourceBundle.getBundle("StartPositionBlack");
    public static final ResourceBundle BUNDLE_STARTING_POSITION_WHITE = ResourceBundle.getBundle("StartPositionWhite");

    private static Board gameBoard;

    public void buildUpGame(){
        String[] startPositionWhite;
        String[] startPositionBlack;
        this.gameBoard = new Board();
        double size = this.gameBoard.getSquares().get("A1").getPrefHeight();
        for (PieceType piece : PieceType.values()) {
            startPositionWhite = BUNDLE_STARTING_POSITION_WHITE.getString(piece.get()).split(",");
            startPositionBlack = BUNDLE_STARTING_POSITION_BLACK.getString(piece.get()).split(",");
            for (String coordinate : startPositionWhite){
                this.gameBoard.getSquares().get(coordinate).setPiecePlaced(PieceFactory.create(piece,WhiteSide.instance(),size));
            }
            for (String coordinate : startPositionBlack){
                this.gameBoard.getSquares().get(coordinate).setPiecePlaced(PieceFactory.create(piece, BlackSide.instance(),size));
            }

        }

    }

    public StackPane getBoard(){
        return gameBoard.getBoardComponent();
    }
}
