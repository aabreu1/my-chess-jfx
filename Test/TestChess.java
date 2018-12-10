import ChessApp.Controll.GameController;
import ChessApp.Model.Board;
import org.junit.Ignore;
import org.junit.Test;


public class TestChess {
    @Test
    @Ignore
    public void Creation() {
        GameController game = new GameController();
        game.BuildUpGame();
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
