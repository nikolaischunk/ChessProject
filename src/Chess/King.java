package Chess;

import java.awt.*;
import java.util.ArrayList;

public class King extends Figur {


    public King(Color color) {
        super(color, color.equals(Color.WHITE) ? '♚' : '♔');
    }

    public boolean canMove(Point currentLocation, Point targetLocation) {
        double oneMoveStraight = 1;
        double oneMoveDiagonal = 1.4142135623730951;

        if (currentLocation.distance(targetLocation) == oneMoveStraight) {
            return true;
        } else return currentLocation.distance(targetLocation) == oneMoveDiagonal;
    }

    public ArrayList<Point> getMovingPath(java.awt.Point currentLocation, java.awt.Point targetLocation) {
        ArrayList<java.awt.Point> movingPath = new ArrayList<>();
        double oneMoveStraight = 1;
        double oneMoveDiagonal = 1.4142135623730951;

        int differenceX = targetLocation.x - currentLocation.x;
        int differenceY = targetLocation.y - currentLocation.y;

        if (currentLocation.distance(targetLocation) == oneMoveStraight) {

            if (currentLocation.x != targetLocation.x) {
                int difference = targetLocation.x - currentLocation.x;

                if (difference < 0) {
                    movingPath.add(((Point) currentLocation.clone()));
                    currentLocation.setLocation(currentLocation.x - 1, currentLocation.y);
                    movingPath.add(((Point) currentLocation.clone()));
                } else if (difference > 0) {
                    movingPath.add(((Point) currentLocation.clone()));
                    currentLocation.setLocation(currentLocation.x + 1, currentLocation.y);
                    movingPath.add(((Point) currentLocation.clone()));
                }

                //matches not Y
            } else if (currentLocation.y != targetLocation.y) {
                int difference = targetLocation.y - currentLocation.y;

                if (difference < 0) {
                    movingPath.add(((Point) currentLocation.clone()));
                    currentLocation.setLocation(currentLocation.x, currentLocation.y - 1);
                    movingPath.add(((Point) currentLocation.clone()));
                } else if (difference > 0) {
                    movingPath.add(((Point) currentLocation.clone()));
                    currentLocation.setLocation(currentLocation.x, currentLocation.y + 1);
                    movingPath.add(((Point) currentLocation.clone()));
                }

            }
            //If the Move is diagonal
        } else if (currentLocation.distance(targetLocation) == oneMoveDiagonal) {

            double distanceBetweenPoints = targetLocation.distance(currentLocation);

            if (differenceX > 0 && differenceY > 0) {

                while (distanceBetweenPoints != 0) {
                    currentLocation.setLocation(++currentLocation.x, ++currentLocation.y);
                    movingPath.add(currentLocation);
                    distanceBetweenPoints = targetLocation.distance(currentLocation);
                }

            } else if (differenceX > 0 && differenceY < 0) {

                while (distanceBetweenPoints != 0) {
                    currentLocation.setLocation(++currentLocation.x, --currentLocation.y);
                    movingPath.add(currentLocation);
                    distanceBetweenPoints = targetLocation.distance(currentLocation);
                }

            } else if (differenceX < 0 && differenceY < 0) {

                while (distanceBetweenPoints != 0) {
                    currentLocation.setLocation(--currentLocation.x, --currentLocation.y);
                    movingPath.add(currentLocation);
                    distanceBetweenPoints = targetLocation.distance(currentLocation);
                }

            } else if (differenceX < 0 && differenceY > 0) {

                while (distanceBetweenPoints != 0) {
                    currentLocation.setLocation(--currentLocation.x, ++currentLocation.y);
                    movingPath.add(currentLocation);
                    distanceBetweenPoints = targetLocation.distance(currentLocation);
                }
            }
        } else {
            System.out.println("Please type in a field number for the king");
        }
        return movingPath;
    }
}

