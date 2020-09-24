package Test;

import Chess.Color;
import Chess.Knight;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;


class KnightTest {

    @Test
    void canMoveBlack() {
        Knight knight = new Knight(Chess.Color.BLACK);
        Point currentLocation = new Point(2, 1);
        Point targetLocation = new Point(3, 3);
        Assertions.assertThat(knight.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }

    @Test
    void canMoveWhite() {
        Knight knight = new Knight(Color.WHITE);
        Point currentLocation = new Point(2, 8);
        Point targetLocation = new Point(3, 6);
        Assertions.assertThat(knight.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }

}