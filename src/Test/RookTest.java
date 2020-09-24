package Test;

import Chess.Color;
import Chess.Queen;
import Chess.Rook;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

class RookTest {

    @Test
    void canMoveBlack() {
        Rook rook = new Rook(Chess.Color.BLACK);
        Point currentLocation = new Point(1, 1);
        Point targetLocation = new Point(1, 2);
        Assertions.assertThat(rook.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }

    @Test
    void canMoveWhite() {
        Rook rook = new Rook(Color.WHITE);
        Point currentLocation = new Point(1, 8);
        Point targetLocation = new Point(1, 7);
        Assertions.assertThat(rook.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }


}