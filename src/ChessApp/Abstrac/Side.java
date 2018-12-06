package ChessApp.Abstrac;

import ChessApp.Type.SideType;

import java.awt.*;

public abstract class Side {
    private SideType side;
    private Color color ;

    public Side (SideType side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.side.toString();
    }
}
