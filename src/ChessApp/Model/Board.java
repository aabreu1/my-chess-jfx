package ChessApp.Model;

import ChessApp.Builder.SquareFactory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class Board implements Initializable {

    @FXML
    private StackPane board;
    @FXML
    private GridPane  boardGrid;

    static Map<String,Square> squares;

    public Board() {
        squares = SquareFactory.BuildUpSqueres();
        try {
            loadFXML();
        }   catch (Exception e){
            System.err.println(e);
        }
        for (Map.Entry<String, Square> square : squares.entrySet()){
            setSquareOnGrid(square.getValue());
        }
    }

    public StackPane getBoardComponent() {
        return board;
    }

    public static Map<String, Square> getSquares() {
        return squares;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //attach events here
        //object.setOnAction(this::eventName)
    }

    public void loadFXML() throws Exception{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/board.fxml"));
            loader.setController(this);
           //loader.setRoot(this);
            loader.load();
    }

    private void setSquareOnGrid(Square square){
        int row = 8-Integer.parseInt(square.getNumber());
        int col = (SquareFactory.COLUMNS.indexOf(square.getCaracter()));
        boardGrid.add(square, col, row);
    }
}
