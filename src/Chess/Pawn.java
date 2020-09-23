package Chess;

import java.awt.*;
import java.util.ArrayList;

public class Pawn extends Figur {
    public Pawn(Color color) {
        super(color, color.equals(Color.WHITE) ? '♟' : '♙');
    }
    public boolean canMove(Point currentLocation, Point targetLocation) {
        if (currentLocation.equals(targetLocation)) {
            return false;
        }
        //Normal moves (one move)
        if (Math.abs(currentLocation.getY() - targetLocation.getY()) == 1
                && Math.abs(currentLocation.getX() - targetLocation.getX()) == 0) {
            //White can move forward
            if (getColor().equals(Color.BLACK)) {
                if (currentLocation.y < targetLocation.y) {
                    return true;
                }
            }
            //Black can only move backward
            if (getColor().equals(Color.WHITE)) {
                if (currentLocation.y > targetLocation.y) {
                    return true;
                }
            }
        }
        // This is for first pawn move.
        if (Math.abs(currentLocation.y - targetLocation.y) == 2
                && Math.abs(currentLocation.x - targetLocation.x) == 0
                && (currentLocation.y == 1 || targetLocation.y == 6)) {
            // White can only move forward
            if (getColor().equals(Color.BLACK)) {
                if (currentLocation.y < targetLocation.y) {
                    return true;
                }
            }
            // Black can only move backward in a sense.
            if (getColor().equals(Color.WHITE)) {
                if (currentLocation.y > targetLocation.y) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public ArrayList<Point> getMovingPath(Point currentLocation, Point targetLocation) {
        return null;
    }
}