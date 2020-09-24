package Chess;

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

    public ArrayList<Point> getMovingPath(Point currentLocation, Point targetLocation) {

        ArrayList<Point> movingPath = new ArrayList<>();
        double oneMoveDiagonal = 1.4142135623730951;
        int differenceX = targetLocation.x - currentLocation.x;
        int differenceY = targetLocation.y - currentLocation.y;

        if (currentLocation.distance(targetLocation) % oneMoveDiagonal == 0) {
            double distanceBetweenPoints = targetLocation.distance(currentLocation);

            if (differenceX > 0 && differenceY > 0) {
                while (distanceBetweenPoints != 0) {
                    currentLocation.setLocation(++currentLocation.x, ++currentLocation.y);
                    movingPath.add(currentLocation);
                    distanceBetweenPoints = targetLocation.distance(currentLocation);
                }
                movingPath.remove(movingPath.size() - 1);

            } else if (differenceX > 0 && differenceY < 0) {

                while (distanceBetweenPoints != 0) {
                    currentLocation.setLocation(++currentLocation.x, --currentLocation.y);
                    movingPath.add(currentLocation);
                    distanceBetweenPoints = targetLocation.distance(currentLocation);
                }
                movingPath.remove(movingPath.size() - 1);

            } else if (differenceX < 0 && differenceY < 0) {

                while (distanceBetweenPoints != 0) {
                    currentLocation.setLocation(--currentLocation.x, --currentLocation.y);
                    movingPath.add(currentLocation);
                    distanceBetweenPoints = targetLocation.distance(currentLocation);
                }
                movingPath.remove(movingPath.size() - 1);

            } else if (differenceX < 0 && differenceY > 0) {

                while (distanceBetweenPoints != 0) {
                    currentLocation.setLocation(--currentLocation.x, ++currentLocation.y);
                    movingPath.add(currentLocation);
                    distanceBetweenPoints = targetLocation.distance(currentLocation);
                }
                movingPath.remove(movingPath.size() - 1);
            }
        }
        return movingPath;
    }
}
