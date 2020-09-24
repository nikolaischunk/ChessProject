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

        int differenceY = targetLocation.y - currentLocation.y;
        int differenceX = targetLocation.x - currentLocation.x;


        if (currentLocation.distance(targetLocation) % oneMoveStraight == 0) {

            if (currentLocation.x != targetLocation.x) {
                int difference = targetLocation.x - currentLocation.x;

                // If X  TL minus CL is negative
                if (difference < 0) {
                    for (int i = 0; i <= difference; i++) {
                        movingPath.add(new Point(targetLocation.x + 1, targetLocation.y));
                    }

                    // if X TL minus CL is positive
                } else if (difference > 0) {
                    for (int i = 0; i <= difference; i++) {
                        movingPath.add(new Point(targetLocation.x - 1, targetLocation.y));
                    }
                }
                // is y = y
            } else if (currentLocation.y != targetLocation.y) {
                int difference = targetLocation.y - currentLocation.y;

                // if Y TL minus CL is negative
                if (difference < 0) {
                    for (int i = 0; i <= difference; i++) {
                        movingPath.add(new Point(targetLocation.x, targetLocation.y + i));
                    }

                    //if Y TL minus CL is positive
                } else if (difference > 0) {
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