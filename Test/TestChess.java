import ChessApp.Controll.GameController;
import org.junit.Test;


public class TestChess {
    @Test
    public void Creation() {
        GameController game = new GameController();
        game.BuildUpGame();
        System.out.println(game.gameBoard.getSquares());
    }

}
