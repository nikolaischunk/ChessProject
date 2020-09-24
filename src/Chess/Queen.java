package Chess;

import java.awt.*;
import java.util.ArrayList;

public class Queen extends Figur {
    double oneMoveStraight = 1;
    double oneMoveDiagonal = 1.4142135623730951;

    public Queen(Color color) {
        super(color, color.equals(Color.WHITE) ? '♛' : '♕');
    }

    public boolean canMove(Point currentLocation, Point targetLocation) {
        if (currentLocation.distance(targetLocation) % oneMoveDiagonal == 0 || currentLocation.distance(targetLocation) % oneMoveStraight == 0) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Point> getMovingPath(Point currentLocation, Point targetLocation) {
        ArrayList<Point> movingPath = new ArrayList<>();

        int differenceX = targetLocation.x - currentLocation.x;
        int differenceY = targetLocation.y - currentLocation.y;

        if (currentLocation.distance(targetLocation) % oneMoveStraight == 0) {
            if (currentLocation.x != targetLocation.x) {
                int difference = targetLocation.x - currentLocation.x;
                if (difference < 0) { // wenn X  TL minus CL im negativen Bereich ist
                    for (int i = 0; i <= difference; i++) {
                        movingPath.add(new Point(targetLocation.x + 1, targetLocation.y));
                    }

                    // wenn X TL minus CL im positiven Bereich ist
                } else if (difference > 0) {
                    for (int i = 0; i <= difference; i++) {
                        movingPath.add(new Point(targetLocation.x - 1, targetLocation.y));
                    }
                }
                // Stimmt Y nicht überein? Wenn y nicht y ist
            } else if (currentLocation.y != targetLocation.y) { //
                int difference = targetLocation.y - currentLocation.y;

                if (difference < 0) { // wenn Y TL minus CL im negativen Bereich ist
                    for (int i = 0; i <= difference; i++) {
                        movingPath.add(new Point(targetLocation.x, targetLocation.y + i));
                    }

                } else if (difference > 0) {// wenn Y TL minus CL im positiven Bereich ist
                    for (int i = 0; i <= difference; i++) {
                        movingPath.add(new Point(targetLocation.x, targetLocation.y - i));
                    }
                 }

            } else {
                System.out.println("Please type in a valid number");
            }
        } else if (currentLocation.distance(targetLocation) % oneMoveDiagonal == 0) {
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