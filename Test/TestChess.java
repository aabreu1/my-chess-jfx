import chessapp.controll.GameController;
import chessapp.model.Board;
import org.junit.Ignore;
import org.junit.Test;


public class TestChess {
    @Test
    @Ignore
    public void Creation() {
        GameController game = new GameController();
        game.buildUpGame();
        //System.out.println(game.gameBoard.getSquares());
    }

    @Test
    public void CargarBoard(){
        Board board = new Board();
        try {
            board.loadFXML();
        }catch (Exception e){
            System.err.println("ui tu ventanita no cargo");
            e.printStackTrace();
        }
    }

}
