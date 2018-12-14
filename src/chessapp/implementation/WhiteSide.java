package chessapp.implementation;

import chessapp.Abstrac.Side;
import chessapp.Type.SideType;

import java.awt.*;

public class WhiteSide extends Side {
    private static WhiteSide white = null;

    public WhiteSide() {
        super(SideType.WHITE, Color.LIGHT_GRAY);
    }

    public static Side instance() {
        if(white == null) {
            white = new WhiteSide();
            return white;
        }
        else {
            return white;
        }
    }

}