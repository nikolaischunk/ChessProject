import java.awt.*;
import java.util.ArrayList;

public class Knight extends Figur {
    public Knight(Color color) {
        super(color, color.equals(Color.WHITE) ? '♞' : '♘');
    }

    public boolean canMove(Point currentLocation, Point targetLocation) {
        double oneMoveHorse = 2.23606797749979;
        return currentLocation.distance(targetLocation) % oneMoveHorse == 0;
    }

    @Override
    public ArrayList<Point> getMovingPath(Point currentLocation, Point targetLocation) {
        return null;
    }


}
//return getMovingPath(currentLocation, targetLocation);