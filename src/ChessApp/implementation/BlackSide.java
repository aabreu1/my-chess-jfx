package ChessApp.implementation;

import ChessApp.Abstrac.Side;
import ChessApp.Type.SideType;

import java.awt.*;

public class BlackSide extends Side {
    private static BlackSide black = null;

    public BlackSide (){
        super(SideType.BLACK, Color.DARK_GRAY);
    }
    public static Side instance(){
        if(black == null) {
            black = new BlackSide();
            return black;
        }
        else {
            return black;
        }
    }

}
