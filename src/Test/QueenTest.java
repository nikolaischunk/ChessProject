package Test;

import Chess.Color;
import Chess.Queen;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

//for simge
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
    void getMovingPath() {
        Queen queen = new Queen(Color.BLACK);

        Point currentLocation = new Point(4, 2);
        Point targetLocation = new Point(2, 3);

        ArrayList movingPath = new ArrayList();
        movingPath.add(5, 1);
        movingPath.add(5, 2);

        Assertions.assertThat(queen.getMovingPath(currentLocation, targetLocation).size()).isEqualTo(movingPath);
    }
}


