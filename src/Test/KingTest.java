package Test;

import Chess.Color;
import Chess.King;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;


class KingTest {

    @Test
    void canMoveBlack() {
        King king = new King(Chess.Color.BLACK);
        Point currentLocation = new Point(4, 1);
        Point targetLocation = new Point(4, 2);
        Assertions.assertThat(king.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }

    @Test
    void canMoveWhite() {
        King king = new King(Color.WHITE);
        Point currentLocation = new Point(4, 8);
        Point targetLocation = new Point(4, 7);
        Assertions.assertThat(king.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }
    
}