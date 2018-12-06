import ChessApp.Builder.PieceFactory;
import ChessApp.Builder.SquareFactory;
import org.junit.Test;

public class TestChess {
    @Test
    public void Creation(){
        System.out.println(PieceFactory.BuildUpGameSetPieces());
        System.out.println(SquareFactory.BuildUpSqueres());
    }
}
