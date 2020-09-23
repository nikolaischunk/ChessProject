import java.awt.*;
import java.util.ArrayList;

public class Bishop extends Figur {
    public Bishop(Color color) {
        super(color, color.equals(Color.WHITE) ? '♝' : '♗');
    }


    public boolean canMove(Point currentLocation, Point targetLocation) {
        double oneMoveDiagonal = 1.4142135623730951;
        if (currentLocation.distance(targetLocation) % oneMoveDiagonal == 0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public ArrayList<Point> getMovingPath(Point currentLocation, Point targetLocation) {
        return null;
    }
}
