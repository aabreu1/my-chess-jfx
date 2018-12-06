package ChessApp.Model;

import ChessApp.Builder.SquareFactory;

import java.util.Iterator;
import java.util.SortedSet;

public class Board implements Iterable<Square>{
    static SortedSet<Square> squares;

    public Board() {
        squares = SquareFactory.BuildUpSqueres();
    }

    @Override
    public Iterator<Square> iterator() {
        return squares.iterator();
    }
}
