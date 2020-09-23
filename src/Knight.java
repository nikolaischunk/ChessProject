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


    public ArrayList<Point> getMovingPath(Point currentLocation, Point targetLocation) {
        ArrayList<java.awt.Point> movingPath = new ArrayList<>();

        currentLocation.setLocation(--currentLocation.x, --currentLocation.y);
        movingPath.add(currentLocation);
        return movingPath;
    }



}
//return getMovingPath(currentLocation, targetLocation);