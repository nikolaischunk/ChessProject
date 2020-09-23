package Test;

import Chess.Color;
import Chess.King;
import Chess.Queen;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class KingTest {

    @Test
    void canMoveBlack() {
        King king = new King(Chess.Color.BLACK);
        Point currentLocation = new Point(4, 1);
        Point targetLocation = new Point(4, 2);
        Assertions.assertThat(king.canMove(currentLocation, targetLocation)).isEqualTo(false);
    }

    @Test
    void canMoveWhite() {
        King king = new King(Color.WHITE);
        Point currentLocation = new Point(4, 8);
        Point targetLocation = new Point(4, 7);
        Assertions.assertThat(king.canMove(currentLocation, targetLocation)).isEqualTo(false);
    }

    @Test
    void getMovingPathBlack() {
        King king = new King(Color.BLACK);
        Point currentLocation = new Point(4, 1);
        Point targetLocation = new Point(4, 2);
        Assertions.assertThat(king.getMovingPath(currentLocation, targetLocation)).isEqualTo(false);
    }
    @Test
    void getMovingPathWhite() {
        King king = new King(Color.WHITE);
        Point currentLocation = new Point(4, 8);
        Point targetLocation = new Point(4, 7);
        Assertions.assertThat(king.getMovingPath(currentLocation, targetLocation)).isEqualTo(false);
    }
}