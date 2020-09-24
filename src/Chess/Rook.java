package Chess;

import java.awt.*;
import java.util.ArrayList;

public class Rook extends Figur {

    double oneMoveStraight = 1;

    public Rook(Color color) {
        super(color, color.equals(Color.WHITE) ? '♜' : '♖');
    }

    public boolean canMove(Point currentLocation, Point targetLocation) {
        if (currentLocation.distance(targetLocation) % oneMoveStraight == 0) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Point> getMovingPath(Point currentLocation, Point targetLocation) {
        ArrayList<Point> movingPath = new ArrayList<>();

        if (canMove(currentLocation, targetLocation)) {
            if (currentLocation.x != targetLocation.x) {
                int difference = targetLocation.x - currentLocation.x;
                // if X  TL minus CL is negative
                if (difference < 0) {
                    for (int i = 0; i <= difference; i++) {
                        movingPath.add(new Point(targetLocation.x + 1, targetLocation.y));
                    }

                    //if X TL minus CL is positive
                } else if (difference > 0) {
                    for (int i = 0; i <= difference; i++) {
                        movingPath.add(new Point(targetLocation.x - 1, targetLocation.y));
                    }
                }
                //is y != y
            } else if (currentLocation.y != targetLocation.y) { //
                int difference = targetLocation.y - currentLocation.y;
                //if Y TL minus CL is negative
                if (difference < 0) {
                    for (int i = 0; i <= difference; i++) {
                        movingPath.add(new Point(targetLocation.x, targetLocation.y + i));
                    }
                    // if Y TL minus CL is positive
                } else if (difference > 0) {
                    for (int i = 0; i <= difference; i++) {
                        movingPath.add(new Point(targetLocation.x, targetLocation.y - i));
                    }
                }

            } else {
                System.out.println("Pleas type in a valid number.");
            }
        } else {
            System.out.println("ERROR");
        }
        return movingPath;

    }
}