package Chess;

import java.awt.*;
import java.util.ArrayList;

public abstract class Figur {

    public ArrayList<Point> getMovingPath;
    private final Color color;
    private final char appearance;

    public Figur(Color color, char appearance) {
        this.appearance = appearance;
        this.color = color;
    }

    public boolean canMove(Point currentLocation, Point targetLocation) {
        return true;
    }

    public Color getColor() {
        return color;
    }

    public char getAppearance() {
        return appearance;
    }
    public abstract ArrayList<Point> getMovingPath(Point currentLocation, Point targetLocation);
}