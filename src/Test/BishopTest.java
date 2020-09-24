package Test;

import Chess.Bishop;
import Chess.Color;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;


class BishopTest {

    @Test
    void canMoveBlack() {
        Bishop bishop = new Bishop(Chess.Color.BLACK);
        Point currentLocation = new Point(3, 1);
        Point targetLocation = new Point(4, 2);
        Assertions.assertThat(bishop.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }

    @Test
    void canMoveWhite() {
        Bishop bishop = new Bishop(Color.WHITE);
        Point currentLocation = new Point(3, 8);
        Point targetLocation = new Point(4, 7);
        Assertions.assertThat(bishop.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }
}