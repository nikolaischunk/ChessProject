package Test;

import Chess.Color;
import Chess.Queen;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

class QueenTest {


    @Test
    void canMoveBlack() {
        Queen queen = new Queen(Color.BLACK);
        Point currentLocation = new Point(4, 1);
        Point targetLocation = new Point(4, 5);
        Assertions.assertThat(queen.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }

    @Test
    void canMoveWhite() {
        Queen queen = new Queen(Color.WHITE);
        Point currentLocation = new Point(4, 8);
        Point targetLocation = new Point(4, 7);
        Assertions.assertThat(queen.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }

    @Test
    void getMovingPathBlack() {
        Queen queen = new Queen(Color.BLACK);

        Point currentLocation = new Point(5, 1);
        Point targetLocation = new Point(5, 3);

        ArrayList<Point> movingPath = new ArrayList();
        movingPath.add(new Point(5, 3));
        movingPath.add(new Point(5, 2));
        movingPath.add(new Point(5, 1));

        Assertions.assertThat(queen.getMovingPath(currentLocation, targetLocation).size()).isEqualTo(movingPath.size());
    }
}


